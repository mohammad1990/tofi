package com.tofi.challenge.managepatientdata.service;

import com.tofi.challenge.managepatientdata.model.patient.imp.Patient;

import java.util.UUID;

public interface IFindPatientById {
    Patient handle(UUID id);
}
