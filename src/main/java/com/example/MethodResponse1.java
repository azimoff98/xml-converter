//package com.example;
//
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//public class MethodResponse {
//
//    @JsonProperty("ResponseCode")
//    private String responseCode;
//    @JsonProperty("ACIP5Response")
//    private String acip5Response;
//    @JsonProperty("ACIP5RawResponse")
//    private Acip5RawResponse acip5RawResponse;
//    @JsonProperty("TransactionID")
//    private String transactionId;
//
//    public MethodResponse() {
//    }
//
//    public String getResponseCode() {
//        return responseCode;
//    }
//
//    public void setResponseCode(final String responseCode) {
//        this.responseCode = responseCode;
//    }
//
//    public String getAcip5Response() {
//        return acip5Response;
//    }
//
//    public void setAcip5Response(final String acip5Response) {
//        this.acip5Response = acip5Response;
//    }
//
//    public Acip5RawResponse getAcip5RawResponse() {
//        return acip5RawResponse;
//    }
//
//    public void setAcip5RawResponse(final Acip5RawResponse acip5RawResponse) {
//        this.acip5RawResponse = acip5RawResponse;
//    }
//
//    public String getTransactionId() {
//        return transactionId;
//    }
//
//    public void setTransactionId(final String transactionId) {
//        this.transactionId = transactionId;
//    }
//
//    @Override
//    public String toString() {
//        return "MethodResponse{" +
//                "responseCode='" + responseCode + '\'' +
//                ", acip5Response='" + acip5Response + '\'' +
//                ", acip5RawResponse=" + acip5RawResponse +
//                ", transactionId='" + transactionId + '\'' +
//                '}';
//    }
//}
