package com.mora.fitnesstracker.controllers;

import com.mora.fitnesstracker.entities.Workout;
import com.mora.fitnesstracker.services.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import com.mora.fitnesstracker.DTO.*;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/create-workout")
    public ResponseEntity<CreateWorkoutResponseDTO> createWorkout(@RequestBody CreateWorkoutRequestDTO createWorkoutRequestDTO) {
        return ResponseEntity.ok(workoutService.createWorkout(createWorkoutRequestDTO));
    }

    @PutMapping("/update-workout/{id}")
    public ResponseEntity<UpdateWorkoutResponseDTO> updateWorkout(@PathVariable("id") long id, @RequestBody UpdateWorkoutRequestDTO updateWorkoutRequestDTO) {
        return ResponseEntity.ok(workoutService.updateWorkout(id, updateWorkoutRequestDTO));
    }
}
