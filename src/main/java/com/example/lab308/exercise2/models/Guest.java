package com.example.lab308.exercise2.models;


import com.example.lab308.exercise2.enums.Status;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Guest {


    @Id
    private Long id;

    private String name;

    private Status status;

    @ManyToMany(mappedBy = "guestList")
    private List<Events> eventsList;

    public Guest() {
    }

    public Guest(String name, Status status, List<Events> eventsList) {
        this.name = name;
        this.status = status;
        this.eventsList = eventsList;
    }

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Events> getEventsList() {
        return eventsList;
    }

    public void setEventsList(List<Events> eventsList) {
        this.eventsList = eventsList;
    }
}
