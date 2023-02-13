package com.example.job_offers;

import jakarta.persistence.*;

@Entity
public class Offer {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private int id;

    @Column(name = "Offer_Name")
    private String name ;

    @Column(name = "Offer_Description")
    private String description ;

    @Column(name = "Offer_Type")
    private String type ;

    @Column(name = "Offer_Location")
    private String location ;

    @Column(name = "Offer_Company")
    private String company ;

    @Column(name = "Offer_Duration")
    private String duration ;

    @Column(name = "Offer_DataPost")
    private String data_post ;

    @Column(name = "Offer_Status")
    private Boolean status ;
    public  Offer(){}
    public Offer(String name, String description, String type, String location, String company, String duration,
                 String data_post, Boolean status) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.location = location;
        this.company = company;
        this.duration = duration;
        this.data_post = data_post;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getData_post() {
        return data_post;
    }

    public void setData_post(String data_post) {
        this.data_post = data_post;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


}
