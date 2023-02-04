package com.yuzarsif.eticaret.dto.model;

public class UserDto {

    private String id;
    private String email;

    public UserDto() {}

    public UserDto(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
