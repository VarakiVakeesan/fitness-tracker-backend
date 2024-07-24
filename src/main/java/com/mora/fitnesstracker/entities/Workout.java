package com.mora.fitnesstracker.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "workout")
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long workoutId;

    @Column
    private String date;

    @Column
    private String name;

    @Column
    private String duration;
}
