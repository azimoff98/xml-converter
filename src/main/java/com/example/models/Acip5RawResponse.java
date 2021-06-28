package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Acip5RawResponse {

    @JsonProperty("params")
    private Params params;
    @JsonProperty("fault")
    private Fault fault;

    @lombok.Data
    @ToString
    public static class Params {
        @JsonProperty("param")
        private Param param;
    }

    @lombok.Data
    @ToString
    public static class Param {
        @JsonProperty("value")
        private Value value;
    }

    @lombok.Data
    @ToString
    public static class Fault {
        private Value value;
    }

    @lombok.Data
    @ToString
    public static class Struct {
        @JsonProperty("member")
        private List<Member> members;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Setter
    @Getter
    @ToString
    public static class Member {
        @JsonProperty("name")
        private String name;
        @JsonProperty("value")
        private Value value;
    }

    @lombok.Data
    @ToString
    public static class Array {
        @JsonProperty("data")
        private Data data;
    }

    @lombok.Data
    @ToString
    public static class Data {
        @JsonProperty("value")
        private List<Value> values;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Setter
    @Getter
    @ToString
    public static class Value {
        @JsonProperty("array")
        private Array array;
        @JsonProperty("struct")
        private Struct struct;
        @JsonProperty("dateTime.iso8601")
        private String dateTime;
        @JsonProperty("i4")
        private String i4;
        @JsonProperty("string")
        private String string;
    }
}
