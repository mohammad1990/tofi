package com.tofi.challenge.managepatientdata.model;


import com.tofi.challenge.managepatientdata.model.entity.PatientEntity;
import com.tofi.challenge.managepatientdata.model.entity.VisitEntity;
import com.tofi.challenge.managepatientdata.model.patient.imp.Patient;
import com.tofi.challenge.managepatientdata.model.patient.imp.PatientModelBuilder;
import com.tofi.challenge.managepatientdata.model.visit.imp.Visit;
import com.tofi.challenge.managepatientdata.model.visit.imp.VisitModelBuilder;
import lombok.AllArgsConstructor;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@AllArgsConstructor
public class EntityUtils {
    private final PatientModelBuilder patientBuilder;
    private final VisitModelBuilder visitBuilder;

    public Patient patient(PatientEntity patientEntity) {
        final var id = patientEntity.getId();
        final var name = patientEntity.getName();
        final var surname = patientEntity.getSurname();
        final var dateOfBirth = patientEntity.getDateOfBirth();
        final var socialSecurityNumber = patientEntity.getSocialSecurityNumber();
        return patientBuilder.build(id, name, surname, dateOfBirth, socialSecurityNumber);
    }

    public Visit visit(VisitEntity visitEntity) {
        return visitBuilder.build(visitEntity.getId(), visitEntity.getPatientId(),visitEntity.getVisitDate(),visitEntity.getVisitType(), visitEntity.getReason(),visitEntity.getFamilyHistory());
    }
}
