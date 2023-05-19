package com.example.bestcrmintheunivers.entitiesHw;


import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class DealHw {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private Double budget;
    private String state;
    private String name;
    private Date date;

    @OneToOne
    @JoinColumn(name = "contact_point_id")

    private EmployHw contactPoint;

    @ManyToOne
    @JoinColumn(name = "client_id")

    private ClientHw clientHw;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) { this.date = date; }

    public EmployHw getContactPoint() {
        return contactPoint;
    }

    public void setContactPoint(EmployHw contactPoint) {
        this.contactPoint = contactPoint;
    }

    public ClientHw getClientHw() {
        return clientHw;
    }

    public void setClientHw(ClientHw clientHw) {
        this.clientHw = clientHw;
    }
}