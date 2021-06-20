package com.tofi.challenge.managepatientdata.model.visit.imp;

import com.tofi.challenge.managepatientdata.constants.Reason;
import com.tofi.challenge.managepatientdata.constants.VisitType;
import lombok.AllArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.time.LocalDateTime;
import java.util.UUID;

@Named
@ApplicationScoped
@AllArgsConstructor
public class VisitModelBuilder {

    public Visit build(UUID patientId, LocalDateTime visitDate, VisitType VisitType, Reason reason, String familyHistory) {

        return new Visit(UUID.randomUUID(),patientId, visitDate,VisitType.name(),reason.name(),familyHistory);
    }

    public Visit build(
            UUID id, UUID patientId, LocalDateTime visitDate, String VisitType, String reason, String familyHistory) {
        return new Visit(id, patientId,visitDate, VisitType,reason,familyHistory);
    }
}
