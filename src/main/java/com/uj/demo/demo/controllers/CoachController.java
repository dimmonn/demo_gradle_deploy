package com.uj.demo.demo.controllers;

import com.uj.demo.demo.models.Coach;
import com.uj.demo.demo.services.CoachService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coaches")
public class CoachController {
    private final CoachService coachService;

    public CoachController(CoachService coachService) {
        this.coachService = coachService;
    }

    @GetMapping
    public List<Coach> getAllCoaches() {
        return coachService.getAllCoaches();
    }

    @GetMapping("/{id}")
    public Coach getCoachById(@PathVariable Long id) {
        return coachService.getCoachById(id);
    }

    @PostMapping
    public Coach addCoach(@RequestBody Coach coach) {
        return coachService.addCoach(coach);
    }
}
