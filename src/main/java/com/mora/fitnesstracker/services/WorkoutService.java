package com.mora.fitnesstracker.services;

import com.mora.fitnesstracker.entities.Workout;
import com.mora.fitnesstracker.repositories.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutService {
    @Autowired
    private WorkoutRepository workoutRepository;
    public List<Workout> getWorkouts() {
        return workoutRepository.findAll();
    }
}
