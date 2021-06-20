package com.tofi.challenge.managepatientdata.model.entity;


import com.tofi.challenge.managepatientdata.model.patient.imp.Patient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.time.LocalDate;
import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PATIENTS")
public class PatientEntity {
    @Id
    private UUID id;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private long socialSecurityNumber;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "visit")
    private List<VisitEntity> visits;


    public PatientEntity(Patient patient) {
        this.id = patient.getId();
        update(patient);
    }
    public void update(Patient patient) {
        this.name = patient.getName();
        this.surname = patient.getSurname();
        this.dateOfBirth = patient.getDateOfBirth();
        this.socialSecurityNumber = patient.getSocialSecurityNumber();
    }
}
