package com.example.demo.controller;

import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PatientController {
    @Autowired
    private PatientService service;

    //CRUD
    @GetMapping("/patients")
    public List<Patient> getAllPatient() {
        return service.getAllPatient();
    }

    @PostMapping("/patients")
    public void addPatient(@RequestBody Patient patient) {
        service.save(patient);
    }

    @GetMapping("/patients/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return service.getPatient(id);
    }

    @PutMapping("/patients/{id}")
    public void update(@RequestBody Patient patient) {
        service.update(patient);
    }

    @DeleteMapping("/patients/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

