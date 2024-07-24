package com.mora.fitnesstracker.controllers;

import com.mora.fitnesstracker.entities.Workout;
import com.mora.fitnesstracker.services.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workout")
public class WorkoutController {
    @Autowired
    private WorkoutService workoutService;
    @GetMapping("/get-workouts")
    public ResponseEntity<List<Workout>> getWorkouts() {
        List<Workout> workouts = workoutService.getWorkouts();
        return ResponseEntity.ok(workouts);
    }
}
