package com.yuzarsif.eticaret.dto.model;

import java.util.Set;

public class CustomerDto {

    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private Set<TelNoDto> phoneNumber;
    private Set<UserAddressDto> address;

    public CustomerDto() {}

    public CustomerDto(String id, String email, String firstName, String lastName, Set<TelNoDto> phoneNumber, Set<UserAddressDto> address) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Set<TelNoDto> getPhoneNumber() {
        return phoneNumber;
    }

    public Set<UserAddressDto> getAddress() {
        return address;
    }
}
