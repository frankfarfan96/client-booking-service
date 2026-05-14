package com.cm.client_service.service;

import com.cm.client_service.dto.PatientResponseDTO;
import com.cm.client_service.model.Patient;
import com.cm.client_service.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private PatientRepository patientRepository;
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatients () {
        List<Patient> patients = patientRepository.findAll();


        return null;
    }
}
