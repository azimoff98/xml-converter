package com.example.utils;

import com.example.models.Acip5RawResponse;
import com.example.models.Acip5RawResponse.Member;
import com.example.models.Acip5RawResponse.Struct;
import com.example.models.Acip5RawResponse.Value;
import com.example.models.MethodResponse;
import com.example.models.RequestType;
import com.example.models.tree.MemberNode;
import com.example.models.tree.ValueNode;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class ResponseConverterV2 {

  private static Map<String, String> values = new LinkedHashMap<>();

  private static final Map<String, String> REQUEST_RESPONSE_RELATIONS =
      ImmutableMap.<String, String>builder()
          .put("dedicatedAccountID", "dedicatedAccountActiveValue1")
          .build();

  public static Optional<String> responseMap(MethodResponse methodResponse,
                                             Integer resourceId,
                                             RequestType requestType) {

    if (methodResponse.getAcip5RawResponse() != null) {
      Acip5RawResponse acip5RawResponse = methodResponse.getAcip5RawResponse();
      Struct struct = acip5RawResponse
          .getParams()
          .getParam()
          .getValue()
          .getStruct();

      MemberNode root = new MemberNode();
      root.setMemberName("root");
      List<MemberNode> valueNodes = new ArrayList<>();
      for (Member member : struct.getMembers()) {
        MemberNode memberNode = processMember(member);
        valueNodes.add(memberNode);
      }
      root.setValues(valueNodes);

      Optional<MemberNode> requestedNode = findMemberNodeByName(root, requestType.getType());
      if (requestedNode.isPresent()) {

        Optional<ValueNode> requestCheckResult = requestedNode.get().getValues()
            .stream()
            .map(o -> (ValueNode) o)
            .filter(node -> node.getValue().equals(String.valueOf(resourceId)))
            .findFirst();

        if (requestCheckResult.isPresent()) {
          String targetTagName = REQUEST_RESPONSE_RELATIONS.get(requestType.getType());
          return findMemberNodeByName(root, targetTagName)
              .map(memberNode -> String.format("Found: %s --- %s",
                  memberNode.getMemberName(),
                  memberNode.getValues()));
        }
      }
    }

    return Optional.empty();
  }

  // walking on the tree
  private static Optional<MemberNode> findMemberNodeByName(MemberNode root,
                                                           String tagName) {
    Queue<MemberNode> memberNodes = new ArrayDeque<>();
    memberNodes.add(root);

    Set<MemberNode> visited = new HashSet<>();
    MemberNode found = null;
    while (!memberNodes.isEmpty()) {
      MemberNode polled = memberNodes.poll();
      visited.add(polled);

      if (!(polled instanceof ValueNode) &&
          polled.getMemberName().equals(tagName)) {
        found = polled;
        break;
      }

      for (Object node : polled.getValues()) {
        if (node instanceof ValueNode) {
          if (!visited.contains((ValueNode) node)) {
            memberNodes.add((ValueNode) node);
          }
        } else {
          if (!visited.contains((MemberNode) node)) {
            memberNodes.add((MemberNode) node);
          }
        }
      }
    }
    return Optional.ofNullable(found);
  }

  private static MemberNode processMember(Member member) {
    MemberNode memberNode = new MemberNode();
    List<MemberNode> valueNodes = processValue(member.getValue());
    memberNode.setMemberName(member.getName());
    memberNode.setValues(valueNodes);
    return memberNode;
  }

  private static List<MemberNode> processValue(Value value) {
    if (value.getString() != null) {
      return Collections.singletonList(new ValueNode(value.getString()));
    } else if (value.getDateTime() != null) {
      return Collections.singletonList(new ValueNode(value.getDateTime()));
    } else if (value.getI4() != null) {
      return Collections.singletonList(new ValueNode(value.getI4()));
    } else if (value.getArray() != null) {
      return value.getArray().getData().getValues()
          .stream()
          .map(ResponseConverterV2::processValue)
          .flatMap(List::stream)
          .collect(Collectors.toList());
    } else {
      return value.getStruct().getMembers()
          .stream()
          .map(ResponseConverterV2::processMember)
          .collect(Collectors.toList());
    }
  }
}
