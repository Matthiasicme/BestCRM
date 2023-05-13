package com.example.bestcrmintheunivers.entities;


import jakarta.persistence.*;
import main.java.com.example.bestcrmintheunivers.entities.Employ;

import java.sql.Date;

@Entity
public class Deal {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
private Double budget;
private String state;
private String name;
private Date startDate;

@OneToOne
@JoinColumn(name = "contact_point_id")

private main.java.com.example.bestcrmintheunivers.entities.Employ contactPoint;

@ManyToOne
@JoinColumn(name = "client_id")

private Client client;

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Employ getContactPoint() {
        return contactPoint;
    }

    public void setContactPoint(Employ contactPoint) {
        this.contactPoint = contactPoint;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}