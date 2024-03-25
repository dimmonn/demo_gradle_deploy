package com.uj.demo.demo.repositories;
import com.uj.demo.demo.models.Coach;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoachRepository extends JpaRepository<Coach, Long> {
    Coach save(Coach coach);
}