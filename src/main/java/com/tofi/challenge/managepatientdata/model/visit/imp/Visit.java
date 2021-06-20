package com.tofi.challenge.managepatientdata.model.visit.imp;

import com.tofi.challenge.managepatientdata.constants.Reason;
import com.tofi.challenge.managepatientdata.constants.ValidationMessages;
import com.tofi.challenge.managepatientdata.constants.VisitType;
import io.smallrye.common.constraint.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Visit {
    @NotNull
    private UUID id;
    @NotNull
    private UUID patientId;
    @NotBlank(message = ValidationMessages.DATE_MUST_BE_NOT_BLANK)
    private LocalDateTime visitDate;
    @NotBlank(message = ValidationMessages.VISIT_TYPE_MUST_BE_NOT_BLANK)
    private String VisitType;
    @NotBlank(message = ValidationMessages.REASON_MUST_BE_NOT_BLANK)
    private String reason;
    @NotBlank(message = ValidationMessages.FAMILY_HISTORY_MUST_BE_NOT_BLANK)
    private String familyHistory;

}
