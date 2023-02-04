package com.yuzarsif.eticaret.dto.model;

import com.yuzarsif.eticaret.model.User;

public class AddressDto {

    private int id;
    private String apartmentNo;
    private String flat;
    private String street;
    private String province;
    private String district;
    private String country;
    private UserDto user;

    public AddressDto() {}

    public AddressDto(int id, String apartmentNo, String flat, String street, String province, String district, String country, UserDto user) {
        this.id = id;
        this.apartmentNo = apartmentNo;
        this.flat = flat;
        this.street = street;
        this.province = province;
        this.district = district;
        this.country = country;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public String getApartmentNo() {
        return apartmentNo;
    }

    public String getFlat() {
        return flat;
    }

    public String getStreet() {
        return street;
    }

    public String getProvince() {
        return province;
    }

    public String getDistrict() {
        return district;
    }

    public String getCountry() {
        return country;
    }

    public UserDto getUserDto() {
        return user;
    }
}
