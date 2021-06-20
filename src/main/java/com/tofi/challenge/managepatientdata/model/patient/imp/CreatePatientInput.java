package com.tofi.challenge.managepatientdata.model.patient.imp;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
public class CreatePatientInput {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private long socialSecurityNumber;
}
