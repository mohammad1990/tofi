package com.tofi.challenge.managepatientdata.controller.request;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.tofi.challenge.managepatientdata.constants.Reason;
import com.tofi.challenge.managepatientdata.constants.VisitType;
import com.tofi.challenge.managepatientdata.model.visit.imp.CreateVisitInput;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

@Getter
@Setter
@JsonRootName("visit")
@RegisterForReflection
public class NewVisitRequest {
    private UUID patientId;
    private LocalDateTime visitDate;
    private VisitType visitType;
    private Reason reason;
    private String familyHistory;

    public CreateVisitInput toCreateVisitInput() {
        return new CreateVisitInput(this.patientId,
                this.visitDate,this.visitType, this.reason , this.familyHistory);
    }
}
