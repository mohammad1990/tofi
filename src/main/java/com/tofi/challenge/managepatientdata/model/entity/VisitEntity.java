package com.tofi.challenge.managepatientdata.model.entity;


import com.tofi.challenge.managepatientdata.model.visit.imp.Visit;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "VISIT")
public class VisitEntity {
    @Id
    private UUID id;
    private UUID patientId;
    private LocalDateTime visitDate;
    private String visitType;
    private String reason;
    private String familyHistory;

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id", nullable = false)
    private PatientEntity patient;


    public VisitEntity(Visit visit, PatientEntity patient) {
        this.id = patient.getId();
        this.patient = patient;
        update(visit);
    }

    public void update(Visit visit) {
        this.reason = visit.getReason();
        this.visitType = visit.getVisitType();
        this.id = visit.getId();
        this.visitDate = visit.getVisitDate();
    }
}
