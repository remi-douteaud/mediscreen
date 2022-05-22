package com.openclassrooms.mediscreen.service;

import com.openclassrooms.mediscreen.data.dto.PatientDto;

public interface PatientService {

  void addPerson(PatientDto patientDto);

  PatientDto getPerson(int id);
}
