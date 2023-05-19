package com.example.bestcrmintheunivers.entitiesHw;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class NoteHw {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String title;
    private String state;
    private LocalDateTime dateTime;
    private String content;


    @ManyToOne
    @JoinColumn(name = "client_id")

    private ClientHw clientHw;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ClientHw getClientHw() {
        return clientHw;
    }

    public void setClientHw(ClientHw clientHw) {
        this.clientHw = clientHw;
    }
}



