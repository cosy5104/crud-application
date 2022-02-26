package com.example.sgapractical.model;

import javax.persistence.*;

@Entity
@Table(name="vehicle_details", schema = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
        private long id;

    @Column(name = "registration")
    private String registration;

    @Column(name = "type")
    private String type;

    @Column(name = "make")
    private String make;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}