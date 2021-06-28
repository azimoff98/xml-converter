package com.example.models;

public enum RequestType {


  DEDICATED_ACCOUNT_ID("dedicatedAccountID");

  RequestType(String type) {
    this.type = type;
  }

  private final String type;

  public String getType() {
    return type;
  }
}
