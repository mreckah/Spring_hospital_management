package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Patient {
    @Id
    Long id;
    String name;
    Date dateOfBirth;
    boolean sickness;
    int score;

}
