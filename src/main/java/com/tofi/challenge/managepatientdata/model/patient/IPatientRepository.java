package com.tofi.challenge.managepatientdata.model.patient;

import com.tofi.challenge.managepatientdata.model.patient.imp.Patient;

import java.util.Optional;
import java.util.UUID;

public interface IPatientRepository {
    void save(Patient patient);
    Optional<Patient> findPatientById(UUID id);
}
