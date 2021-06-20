package com.tofi.challenge.managepatientdata.service;

import com.tofi.challenge.managepatientdata.model.patient.imp.CreatePatientInput;
 import com.tofi.challenge.managepatientdata.model.patient.imp.Patient;

public interface ICreatePatient {
    Patient handle(CreatePatientInput createPatientInput);
}
