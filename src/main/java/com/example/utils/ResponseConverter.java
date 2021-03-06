package com.example.utils;

import com.example.models.Acip5RawResponse;
import com.example.models.Acip5RawResponse.Member;
import com.example.models.Acip5RawResponse.Struct;
import com.example.models.Acip5RawResponse.Value;
import com.example.models.MethodResponse;
import com.google.common.collect.ImmutableMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ResponseConverter {

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

  private static String processMember(Member member) {
    String response = processValue(member.getValue());
    return String.format("MemberName: %s - value(s): %s", member.getName(), response);
  }

  private static String processValue(Value value) {
    if (value.getString() != null) {
      return value.getString();
    } else if (value.getDateTime() != null) {
      return value.getDateTime();
    } else if (value.getI4() != null) {
      return value.getI4();
    } else if (value.getArray() != null) {
      StringBuilder valueBuffer = new StringBuilder();
      for (Value val : value.getArray().getData().getValues()) {
        valueBuffer.append(processValue(val)).append(", ");
      }
      return valueBuffer.substring(0, valueBuffer.length() - 2);
    } else {
      StringBuilder valueBuffer = new StringBuilder();
      for (Member member : value.getStruct().getMembers()) {
        valueBuffer.append(processMember(member)).append(", ");
      }
      return valueBuffer.substring(0, valueBuffer.length() - 2);
    }
  }
}
