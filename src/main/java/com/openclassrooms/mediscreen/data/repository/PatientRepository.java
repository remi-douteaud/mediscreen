package com.openclassrooms.mediscreen.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openclassrooms.mediscreen.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
