package com.uj.demo.demo.repositories;

import com.uj.demo.demo.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByCoachId(Long coachId);

    List<Event> findByClubId(Long clubId);

    Event save(Event event);
}
