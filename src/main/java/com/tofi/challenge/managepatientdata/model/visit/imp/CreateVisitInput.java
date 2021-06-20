package com.tofi.challenge.managepatientdata.model.visit.imp;

import com.tofi.challenge.managepatientdata.constants.Reason;
import com.tofi.challenge.managepatientdata.constants.VisitType;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
public class CreateVisitInput {
    private UUID patientId;
    private LocalDateTime visitDate;
    private VisitType visitType;
    private Reason reason;
    private String familyHistory;
}
