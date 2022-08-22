package com.example.lab308.exercise2.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Conference extends Events {


    @ManyToMany
    @JoinTable(name = "conference_speaker", joinColumns = {@JoinColumn(name = "conference_id")}, inverseJoinColumns = {@JoinColumn(name = "speaker_id")})
    private List<Speaker> speakerList;


    public Conference() {
    }

    public Conference(LocalDate date, int duration, String title, List<Guest> guestList, List<Speaker> speakerList) {
        super(date, duration, title, guestList);
        this.speakerList = speakerList;
    }

}
