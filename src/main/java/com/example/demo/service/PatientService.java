package com.example.demo.service;

import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepo repo;



    public List<Patient> getAllPatient() {
        return repo.findAll();
    }

    public Patient getPatient(Long id) {
        return repo.findById(id).get();
    }
    public void save(Patient patient) {
        repo.save(patient);
    }
    public void update(Patient patient) {
        repo.save(patient);
    }
    public void delete(Long id) {
        repo.deleteById(id);

    }


}

