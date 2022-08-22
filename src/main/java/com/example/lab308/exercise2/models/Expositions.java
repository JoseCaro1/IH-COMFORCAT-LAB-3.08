package com.example.lab308.exercise2.models;


import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Expositions extends Events{

    public Expositions() {
    }

    public Expositions(LocalDate date, int duration, String title, List<Guest> guestList) {
        super(date, duration, title, guestList);
    }

}
