package com.yuzarsif.eticaret.dto.request;

public class CreateCustomerRequest {

    private String userId;
    private String firstName;
    private String lastName;

    public CreateCustomerRequest() {}

    public CreateCustomerRequest(String userId, String firstName, String lastName) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
