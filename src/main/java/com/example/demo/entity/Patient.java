package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String name;
    private Date dateOfBirth;
    private boolean sickness;
    private int score;
}
