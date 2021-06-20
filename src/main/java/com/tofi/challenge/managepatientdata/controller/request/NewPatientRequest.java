package com.tofi.challenge.managepatientdata.controller.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.tofi.challenge.managepatientdata.model.patient.imp.CreatePatientInput;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@JsonRootName("patient")
@RegisterForReflection
public class NewPatientRequest {
    private String name;
    private String surname;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
    private LocalDate dateOfBirth;
    private long socialSecurityNumber;

    public CreatePatientInput toCreatePatientInput() {
        return new CreatePatientInput(this.name,this.surname,this.dateOfBirth,this.socialSecurityNumber);
    }
}
