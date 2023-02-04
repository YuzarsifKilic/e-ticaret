package com.yuzarsif.eticaret.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Customer extends User {

    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "user", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private Set<TelNo> telNumbers = new HashSet<>();
    @OneToMany(mappedBy = "user", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private Set<Address> addresses = new HashSet<>();

    public Customer() {}

    public Customer(String id, String email, String password, boolean isActive, String firstName, String lastName) {
        super(id, email, password, isActive);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(String email, String password, boolean isActive, String firstName, String lastName, Set<TelNo> telNumbers, Set<Address> addresses) {
        super(email, password, isActive);
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNumbers = telNumbers;
        this.addresses = addresses;
    }

    public Customer(String id, String email, String password, boolean isActive, String firstName, String lastName, Set<TelNo> telNumbers, Set<Address> addresses) {
        super(id, email, password, isActive);
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNumbers = telNumbers;
        this.addresses = addresses;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Set<TelNo> getTelNumbers() {
        return telNumbers;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(telNumbers, customer.telNumbers) && Objects.equals(addresses, customer.addresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstName, lastName);
    }
}
