package com.example.lab308.exercise1.models;


import javax.persistence.*;
import java.util.List;

@Entity
public class Chapter {

    @Id
    private Long id;

    private String name;

    private String district;

    @ManyToOne
    private Association association;

    @OneToOne(cascade = CascadeType.ALL)
    private Member president;

    @OneToMany(mappedBy = "chapter")
    private List<Member> memberList;

    public Chapter() {
    }

    public Chapter(String name, String district, Association association, Member president, List<Member> memberList) {
        this.name = name;
        this.district = district;
        this.association = association;
        this.president = president;
        this.memberList = memberList;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }
}
