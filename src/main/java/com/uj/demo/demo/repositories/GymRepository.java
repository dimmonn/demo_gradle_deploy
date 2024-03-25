package com.uj.demo.demo.repositories;

import com.uj.demo.demo.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymRepository extends JpaRepository<Club, Long> {
    Club save(Club club);
}