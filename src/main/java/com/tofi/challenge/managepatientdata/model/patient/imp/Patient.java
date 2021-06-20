package com.tofi.challenge.managepatientdata.model.patient.imp;

import com.tofi.challenge.managepatientdata.constants.ValidationMessages;
import io.smallrye.common.constraint.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Patient {

    @NotNull
    private UUID id;
    @NotBlank(message = ValidationMessages.NAME_MUST_BE_NOT_BLANK)
    private String name;
    @NotBlank(message = ValidationMessages.SURNAME_MUST_BE_NOT_BLANK)
    private String surname;
    @NotBlank(message = ValidationMessages.DATEOFBIRTH_MUST_BE_NOT_BLANK)
    private LocalDate dateOfBirth;
    @NotBlank(message = ValidationMessages.SOCIALSECURITYNUMBER_MUST_BE_NOT_BLANK)
    private long socialSecurityNumber;
}
