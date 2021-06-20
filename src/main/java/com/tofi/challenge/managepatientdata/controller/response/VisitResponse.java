package com.tofi.challenge.managepatientdata.controller.response;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.tofi.challenge.managepatientdata.constants.Reason;
import com.tofi.challenge.managepatientdata.constants.VisitType;
import com.tofi.challenge.managepatientdata.model.visit.imp.Visit;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@JsonRootName("visit")
@RegisterForReflection
public class VisitResponse {
    private UUID patientId;
    private LocalDateTime visitDate;
    private VisitType visitType;
    private Reason reason;
    private String familyHistory;

    public VisitResponse(Visit visit) {
        this.patientId = visit.getId();
        this.visitDate = visit.getVisitDate();
        this.visitType = VisitType.valueOf(visit.getVisitType());
        this.reason = Reason.valueOf(visit.getReason());
        this.familyHistory = visit.getFamilyHistory();
    }
}
