package com.yuzarsif.eticaret.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Company extends User {

    private String companyName;
    private String webSite;
    @OneToMany(mappedBy = "user", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private Set<TelNo> telNumbers = new HashSet<>();
    @OneToMany(mappedBy = "user", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private Set<Address> addresses = new HashSet<>();

    public Company() {}

    public Company(String email, String password, boolean isActive, String companyName, String webSite, Set<TelNo> telNumbers, Set<Address> addresses) {
        super(email, password, isActive);
        this.companyName = companyName;
        this.webSite = webSite;
        this.telNumbers = telNumbers;
        this.addresses = addresses;
    }

    public Company(String id, String email, String password, boolean isActive, String companyName, String webSite) {
        super(id, email, password, isActive);
        this.companyName = companyName;
        this.webSite = webSite;
    }

    public Company(String id, String email, String password, boolean isActive, String companyName, String webSite, Set<TelNo> telNumbers, Set<Address> addresses) {
        super(id, email, password, isActive);
        this.companyName = companyName;
        this.webSite = webSite;
        this.telNumbers = telNumbers;
        this.addresses = addresses;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getWebSite() {
        return webSite;
    }

    public Set<TelNo> getTelNumbers() {
        return telNumbers;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }
}
