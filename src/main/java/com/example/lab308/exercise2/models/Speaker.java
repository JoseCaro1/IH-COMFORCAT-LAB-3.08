package com.example.lab308.exercise2.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Speaker {

    @Id
    private Long id;

    private String name;

    private int presentationDuration;

    @ManyToMany(mappedBy = "speakerList")
    private List<Conference> conferenceList;

    public Speaker() {
    }

    public Speaker(String name, int presentationDuration, List<Conference> conferenceList) {
        this.name = name;
        this.presentationDuration = presentationDuration;
        this.conferenceList = conferenceList;
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

    public int getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(int presentationDuration) {
        this.presentationDuration = presentationDuration;
    }

    public List<Conference> getConferenceList() {
        return conferenceList;
    }

    public void setConferenceList(List<Conference> conferenceList) {
        this.conferenceList = conferenceList;
    }
}
