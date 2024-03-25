package com.uj.demo.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "coach_id")
    private Coach coach;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "club_id")
    private Club club;

    public Event() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coach getCoach() {
        return coach;
    }

    public Club getClub() {
        return club;
    }

    public Event(Long id, String name, Coach coach, Club club) {
        this.id = id;
        this.name = name;
        this.coach = coach;
        this.club = club;
    }
}
