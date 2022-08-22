package com.example.lab308.exercise2.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Events {

    @Id
    private Long id;

    private LocalDate date;

    private int duration;

    private String title;

    @ManyToMany
    @JoinTable(name = "events_guest", joinColumns = {@JoinColumn(name = "events_id")}, inverseJoinColumns = {@JoinColumn(name = "guest_id")})
    private List<Guest> guestList;

    protected Events() {
    }

    public Events(LocalDate date, int duration, String title, List<Guest> guestList) {
        this.date = date;
        this.duration = duration;
        this.title = title;
        this.guestList = guestList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }
}
