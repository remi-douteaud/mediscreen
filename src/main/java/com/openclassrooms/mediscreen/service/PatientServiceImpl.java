package com.openclassrooms.mediscreen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.mediscreen.data.dto.PatientDto;
import com.openclassrooms.mediscreen.data.repository.PatientRepository;
import com.openclassrooms.mediscreen.model.Patient;

@Service
public class PatientServiceImpl implements PatientService {

  @Autowired
  private PatientRepository patientRepository;

  @Override
  public void addPerson(PatientDto patientDto) {
    Patient patient = new Patient(patientDto);
    patientRepository.save(patient);
  }

  @Override
  public PatientDto getPerson(int id) {
    return new PatientDto(patientRepository.getReferenceById(id));
  }

}
