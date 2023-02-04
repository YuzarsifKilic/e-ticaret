package com.yuzarsif.eticaret.dto.model;

import com.yuzarsif.eticaret.model.TelNoType;

public class TelNoDto {

    private int id;
    private String telNo;
    private TelNoType telNoType;

    public TelNoDto() {}

    public TelNoDto(int id, String telNo, TelNoType telNoType) {
        this.id = id;
        this.telNo = telNo;
        this.telNoType = telNoType;
    }

    public int getId() {
        return id;
    }

    public String getTelNo() {
        return telNo;
    }

    public TelNoType getTelNoType() {
        return telNoType;
    }

}
