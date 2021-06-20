package com.tofi.challenge.managepatientdata.service;

import com.tofi.challenge.managepatientdata.model.visit.imp.Visit;

import java.util.List;
import java.util.UUID;

public interface IFindPatientVisitsById {
    List<Visit> handle(UUID id);
}
