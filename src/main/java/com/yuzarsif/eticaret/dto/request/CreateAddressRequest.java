package com.yuzarsif.eticaret.dto.request;

public class CreateAddressRequest {

    private int id;
    private String apartmentNo;
    private String flat;
    private String street;
    private String province;
    private String district;
    private String country;
    private String userId;

    public CreateAddressRequest() {}

    public CreateAddressRequest(int id, String apartmentNo, String flat, String street, String province, String district, String country, String userId) {
        this.id = id;
        this.apartmentNo = apartmentNo;
        this.flat = flat;
        this.street = street;
        this.province = province;
        this.district = district;
        this.country = country;
        this.userId = userId;
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

    public String getUserId() {
        return userId;
    }
}
