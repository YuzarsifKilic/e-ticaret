package com.yuzarsif.eticaret.dto.model;

import java.util.Set;

public class CompanyDto {

    private String id;
    private String email;
    private String companyName;
    private String webSite;
    private Set<TelNoDto> phoneNumber;
    private Set<UserAddressDto> address;

    public CompanyDto() {}

    public CompanyDto(String id, String email, String companyName, String webSite, Set<TelNoDto> phoneNumber, Set<UserAddressDto> address) {
        this.id = id;
        this.email = email;
        this.companyName = companyName;
        this.webSite = webSite;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getWebSite() {
        return webSite;
    }

    public Set<TelNoDto> getPhoneNumber() {
        return phoneNumber;
    }

    public Set<UserAddressDto> getAddress() {
        return address;
    }
}
