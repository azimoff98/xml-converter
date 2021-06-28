package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MethodResponse {
    @JsonProperty("ResponseCode")
    private String responseCode;
    @JsonProperty("ACIP5Response")
    private String acip5Response;
    @JsonProperty("ACIP5RawResponse")
    private Acip5RawResponse acip5RawResponse;
    @JsonProperty("TransactionID")
    private String transactionId;
    private boolean isSuccess;

    public MethodResponse(boolean isSuccess){
        this("0", null, null, null, isSuccess);
    }
    @Override
    public String toString() {
        return "MethodResponse{" +
                "responseCode='" + responseCode + '\'' +
                ", acip5Response='" + acip5Response + '\'' +
                ", acip5RawResponse=" + acip5RawResponse +
                ", transactionId='" + transactionId + '\'' +
                ", isSuccess=" + isSuccess +
                '}';
    }
}
