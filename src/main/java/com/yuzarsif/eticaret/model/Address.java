package com.yuzarsif.eticaret.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String apartmentNo;
    private String flat;
    private String street;
    private String province;
    private String district;
    private String country;
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Address() {}

    public Address(String apartmentNo, String flat, String street, String province, String district, String country, User user) {
        this.apartmentNo = apartmentNo;
        this.flat = flat;
        this.street = street;
        this.province = province;
        this.district = district;
        this.country = country;
        this.user = user;
    }

    public Address(int id, String apartmentNo, String flat, String street, String province, String district, String country, User user) {
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

    public User getUser() {
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return id == address.id && Objects.equals(apartmentNo, address.apartmentNo) && Objects.equals(flat, address.flat) && Objects.equals(street, address.street) && Objects.equals(province, address.province) && Objects.equals(district, address.district) && Objects.equals(country, address.country) && Objects.equals(user, address.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, apartmentNo, flat, street, province, district, country, user);
    }
}
