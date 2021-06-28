package com.example.utils;

import com.example.models.Acip5RawResponse;
import com.example.models.MethodResponse;

import java.util.LinkedHashMap;
import java.util.Map;

public class DiamondResponseConverter {

//    public static final Set<DiamondResponseMemberEnum> responseMembers;

    private static Map<String, String> values = new LinkedHashMap<>();

//    static {
//        responseMembers = new LinkedHashSet<>(Arrays.asList(DiamondResponseMemberEnum.values()));
//    }

    public static Map<String, String> responseMap(MethodResponse methodResponse) {

//        Map<DiamondResponseMemberEnum, Map<String, String>> responseMap = new LinkedHashMap<>();


        if (methodResponse.getAcip5RawResponse() != null) {
            Acip5RawResponse acip5RawResponse = methodResponse.getAcip5RawResponse();
            acip5RawResponse
                    .getParams()
                    .getParam()
                    .getValue()
                    .getStruct()
                    .getMember()
                    .forEach(m -> System.out.println(processMember(m)));


            System.out.println("ValuesMap : " + values);
        }

        return null;
    }

    private static String processMember(Acip5RawResponse.Member member) {
        String memberName = member.getName();
        String response = processValue(member.getValue());
        values.put(memberName, response);
        return memberName + " : " + response;
    }

    private static String processValue(Acip5RawResponse.Value value) {
        if (value.getString() != null) {
            return value.getString();
        }
        if (value.getDateTime() != null) {
            return value.getDateTime();
        }
        if (value.getI4() != null) {
            return value.getI4();
        }
        if (value.getArray() != null) {
            value.getArray().getData().getValue().forEach(v -> {
                if (v.getArray() != null) {
                    String innerResponse = processValue(v);
                    System.out.println("Inner response value: " + innerResponse);
                }
                if (v.getStruct() != null) {
                    v.getStruct().getMember().forEach(m -> {
                        String innerResponse = processMember(m);
                        System.out.println("Inner response member value: " + innerResponse);
                    });
                }
            });
        }

        return null;
    }
}
