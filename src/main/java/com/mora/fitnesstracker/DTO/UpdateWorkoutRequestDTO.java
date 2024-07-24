package com.mora.fitnesstracker.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateWorkoutRequestDTO {

    private String date;
    private String workoutName;
    private int duration;
}
