package com.yuzarsif.eticaret.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class TelNo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Enumerated(EnumType.STRING)
    @Column(name = "tel_no_type")
    private TelNoType telNoType;
    private String telNo;
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public TelNo() {}

    public TelNo(TelNoType telNoType, String telNo, User user) {
        this.telNoType = telNoType;
        this.telNo = telNo;
        this.user = user;
    }

    public TelNo(int id, TelNoType telNoType, String telNo, User user) {
        this.id = id;
        this.telNoType = telNoType;
        this.telNo = telNo;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public TelNoType getTelNoType() {
        return telNoType;
    }

    public String getTelNo() {
        return telNo;
    }

    public User getUser() {
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelNo telNo1 = (TelNo) o;
        return id == telNo1.id && telNoType == telNo1.telNoType && Objects.equals(telNo, telNo1.telNo) && Objects.equals(user, telNo1.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, telNoType, telNo, user);
    }
}
