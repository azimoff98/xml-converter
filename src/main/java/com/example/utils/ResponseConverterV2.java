package com.example.utils;

import com.example.models.Acip5RawResponse;
import com.example.models.Acip5RawResponse.Member;
import com.example.models.Acip5RawResponse.Struct;
import com.example.models.Acip5RawResponse.Value;
import com.example.models.MethodResponse;
import com.example.models.tree.MemberNode;
import com.example.models.tree.ValueNode;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ResponseConverterV2 {

  private static Map<String, String> values = new LinkedHashMap<>();

  private static final Map<String, String> REQUEST_RESPONSE_RELATIONS =
      ImmutableMap.<String, String>builder()
          .put("dedicatedAccountID", "dedicatedAccountActiveValue1")
          .build();

  public static Map<String, String> responseMap(MethodResponse methodResponse) {

    if (methodResponse.getAcip5RawResponse() != null) {
      Acip5RawResponse acip5RawResponse = methodResponse.getAcip5RawResponse();
      Struct struct = acip5RawResponse
          .getParams()
          .getParam()
          .getValue()
          .getStruct();

      for (Member member : struct.getMembers()) {
        System.out.println(processMember(member));
      }
    }

    return null;
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
