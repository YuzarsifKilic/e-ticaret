package com.yuzarsif.eticaret.dto.request;

import com.yuzarsif.eticaret.model.TelNoType;

public class CreateTelNoRequest {

    private String telNo;
    private TelNoType telNoType;
    private String userId;

    public CreateTelNoRequest() {}

    public CreateTelNoRequest(String telNo, TelNoType telNoType, String userId) {
        this.telNo = telNo;
        this.telNoType = telNoType;
        this.userId = userId;
    }

    public String getTelNo() {
        return telNo;
    }

    public TelNoType getTelNoType() {
        return telNoType;
    }

    public String getUserId() {
        return userId;
    }
}
