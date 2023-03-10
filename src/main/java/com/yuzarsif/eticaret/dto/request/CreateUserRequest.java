package com.yuzarsif.eticaret.dto.request;

public class CreateUserRequest {

    private String email;
    private String password;

    public CreateUserRequest() {}

    public CreateUserRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
