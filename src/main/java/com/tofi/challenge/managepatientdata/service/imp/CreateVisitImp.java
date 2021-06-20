package com.tofi.challenge.managepatientdata.service.imp;

import com.tofi.challenge.managepatientdata.model.patient.imp.CreatePatientInput;
import com.tofi.challenge.managepatientdata.model.patient.imp.Patient;
import com.tofi.challenge.managepatientdata.model.patient.imp.PatientModelBuilder;
import com.tofi.challenge.managepatientdata.model.patient.imp.PatientRepository;
import com.tofi.challenge.managepatientdata.model.visit.imp.CreateVisitInput;
import com.tofi.challenge.managepatientdata.model.visit.imp.Visit;
import com.tofi.challenge.managepatientdata.model.visit.imp.VisitModelBuilder;
import com.tofi.challenge.managepatientdata.model.visit.imp.VisitRepository;
import com.tofi.challenge.managepatientdata.service.ICreateVisit;
import lombok.AllArgsConstructor;

import javax.inject.Singleton;

@AllArgsConstructor
@Singleton
public class CreateVisitImp implements ICreateVisit {
    private final VisitRepository visitRepository;
    private final VisitModelBuilder visitBuilder;

    @Override
    public Visit handle(CreateVisitInput createVisitInput) {
        final var patient = visitBuilder.build(
                createVisitInput.getPatientId(),
                createVisitInput.getVisitDate(),
                createVisitInput.getVisitType(),
                createVisitInput.getReason(),
                createVisitInput.getFamilyHistory()
                );
        visitRepository.save(patient);
        return patient;
    }
}
