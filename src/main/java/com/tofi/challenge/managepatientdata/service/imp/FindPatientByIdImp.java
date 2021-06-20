package com.tofi.challenge.managepatientdata.service.imp;

import com.tofi.challenge.managepatientdata.model.patient.imp.Patient;
import com.tofi.challenge.managepatientdata.model.patient.imp.PatientRepository;
import com.tofi.challenge.managepatientdata.service.IFindPatientById;
import lombok.AllArgsConstructor;

import javax.inject.Singleton;
import java.util.UUID;

@AllArgsConstructor
@Singleton
public class FindPatientByIdImp implements IFindPatientById {

    private final PatientRepository patientRepository;


    @Override
    public Patient handle(UUID id) {
        //TODO Just imp exception
        return patientRepository.findPatientById(id).orElseThrow();
    }
}
