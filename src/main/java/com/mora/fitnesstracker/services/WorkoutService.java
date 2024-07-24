package com.mora.fitnesstracker.services;

import com.mora.fitnesstracker.DTO.CreateWorkoutRequestDTO;
import com.mora.fitnesstracker.DTO.CreateWorkoutResponseDTO;
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

    public CreateWorkoutResponseDTO createWorkout(CreateWorkoutRequestDTO createWorkoutRequestDTO) {
        Workout workout = Workout.builder()
                .date(createWorkoutRequestDTO.getDate())
                .workoutName(createWorkoutRequestDTO.getWorkoutName())
                .duration(createWorkoutRequestDTO.getDuration())
                .build();
        workoutRepository.save(workout);
        return CreateWorkoutResponseDTO.builder()
                .message("Workout created successfully")
                .build();
    }
}
