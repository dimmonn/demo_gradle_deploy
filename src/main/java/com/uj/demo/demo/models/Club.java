package com.uj.demo.demo.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String openingHours;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Event> events = new ArrayList<>();

    public Club() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public Club(Long id, String name, String address, String openingHours) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.openingHours = openingHours;
    }
}
