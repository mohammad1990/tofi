package com.tofi.challenge.managepatientdata.model.patient.imp;

import com.tofi.challenge.managepatientdata.model.patient.imp.Patient;
import lombok.AllArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Named
@ApplicationScoped
@AllArgsConstructor
public class PatientModelBuilder {

    public Patient build(String name, String surname, LocalDate dateOfBirth, long socialSecurityNumber) {
               return new Patient(UUID.randomUUID(),name, surname,dateOfBirth,socialSecurityNumber);
    }

    public Patient build(
            UUID id, String name, String surname, LocalDate dateOfBirth, long socialSecurityNumber) {
        return new Patient(id, name, surname, dateOfBirth, socialSecurityNumber);
    }
}
