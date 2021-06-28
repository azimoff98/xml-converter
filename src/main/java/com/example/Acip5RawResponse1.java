//package com.example;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//import java.util.List;
//
//@Data
//@NoArgsConstructor
//@ToString
//public class Acip5RawResponse {
//
//    private Params params;
//
//    @lombok.Data
//    @ToString
//    public static class Params {
//        private Param param;
//    }
//
//    @lombok.Data
//    @ToString
//    public static class Param {
//        private ValueL2 value;
//    }
//
////    @lombok.Data
////    @ToString
////    public static class ValueL1 {
////        private Struct struct;
////    }
//
//    @lombok.Data
//    @ToString
//    public static class Struct {
//        private List<Member> member;
//    }
//
//    @NoArgsConstructor
//    @AllArgsConstructor
//    @Getter
//    @Setter
//    @ToString
//    public static class Member {
//        private String name;
//        private ValueL2 value;
//    }
//
//    @AllArgsConstructor
//    @NoArgsConstructor
//    @Setter
//    @Getter
//    @ToString
//    public static class ValueL2 {
//        private Array array;
//        private Struct struct;
//        private String string;
//        private Integer i4;
//    }
//
//    @lombok.Data
//    @ToString
//    public static class Array {
//        private Data data;
//    }
//
//    @lombok.Data
//    @ToString
//    public static class Data {
//        private List<ValueL2> value;
//    }
//
////    @lombok.Data
////    @ToString
////    public static class ValueL3 {
////        private Integer i4;
////    }
//}