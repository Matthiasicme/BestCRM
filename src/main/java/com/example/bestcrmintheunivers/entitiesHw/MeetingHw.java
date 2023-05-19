package com.example.bestcrmintheunivers.entitiesHw;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class MeetingHw {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String state;
    private String location;
    private String title;
    private LocalDateTime hour;

    @ManyToOne
    @JoinColumn(name = "client_id")

    private ClientHw clientHw;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getHour() {
        return hour;
    }

    public void setHour(LocalDateTime hour) {
        this.hour = hour;
    }

    public ClientHw getClientHw() {
        return clientHw;
    }

    public void setClientHw(ClientHw clientHw) {
        this.clientHw = clientHw;
    }
}