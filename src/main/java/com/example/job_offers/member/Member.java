package com.example.job_offers.member;

import jakarta.persistence.*;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;

    @Column(name = "Member_FirstName")
    private String first_name ;

    @Column(name = "Member_LastName")
    private String last_name ;

    @Column(name = "Member_Email")
    private String email ;

    @Column(name = "Member_Password")
    private String password ;

    @Column(name = "Member_BirthDate")
    private String birth_date ;

    @Column(name = "Member_ImagePath")
    private String image_path ;

    @Column(name = "Member_Occuption")
    private String occupation ;

    public Member(){}
    public Member(String first_name, String last_name, String email, String password, String birth_date,
                  String image_path, String occupation) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.birth_date = birth_date;
        this.image_path = image_path;
        this.occupation = occupation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

}
