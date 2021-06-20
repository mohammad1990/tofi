package com.tofi.challenge.managepatientdata.controller.response;


import com.fasterxml.jackson.annotation.JsonRootName;
import com.tofi.challenge.managepatientdata.model.patient.imp.Patient;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@JsonRootName("patient")
@RegisterForReflection
public class PatientResponse {
    private UUID id;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Long socialSecurityNumber;

    public PatientResponse(Patient patient) {
        this.id = patient.getId();
        this.name = patient.getName();
        this.surname = patient.getSurname();
        this.dateOfBirth = patient.getDateOfBirth();
        this.socialSecurityNumber = patient.getSocialSecurityNumber();
    }
}
