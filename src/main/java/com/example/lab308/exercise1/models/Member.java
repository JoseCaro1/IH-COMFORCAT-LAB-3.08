package com.example.lab308.exercise1.models;


import com.example.lab308.exercise1.enums.Status;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity
public class Member {

    @Id
    private Long id;

    private String name;

    private Status status;

    private LocalDate renewalDate;

    @ManyToOne
    private Chapter chapter;

    @OneToOne(mappedBy = "president")
    private Chapter chapterPresident;

    public Member() {
    }

    public Member(String name, Status status, LocalDate renewalDate, Chapter chapter, Chapter chapterPresident) {
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
        this.chapter = chapter;
        this.chapterPresident = chapterPresident;
    }

}
