package com.tofi.challenge.managepatientdata.model.visit;

import com.tofi.challenge.managepatientdata.model.visit.imp.Visit;

import java.util.*;

public interface IVisitRepository {
    void save(Visit visit);
    List<Visit> findPatientVisitsById(UUID id);

}
