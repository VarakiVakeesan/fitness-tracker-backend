package com.mora.fitnesstracker.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateWorkoutRequestDTO {

    private String date;
    private String workoutName;
    private int duration;
}
