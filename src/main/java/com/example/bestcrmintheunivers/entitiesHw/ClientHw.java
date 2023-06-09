package com.example.bestcrmintheunivers.entitiesHw;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Set;

@Entity
public class ClientHw {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String country;
    private String business;
    private Date lastContact;


    @OneToMany(mappedBy = "clientHw")
    private Set<DealHw> dealsHw;

    @OneToMany(mappedBy = "clientHw")
    private Set<EmployHw> employeesHw;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public Date getLastContact() {
        return lastContact;
    }

    public void setLastContact(Date lastContact) {
        this.lastContact = lastContact;
    }

    public Set<DealHw> getDealsHw() {
        return dealsHw;
    }

    public void setDealsHw(Set<DealHw> dealsHw) {
        this.dealsHw = dealsHw;
    }
}



