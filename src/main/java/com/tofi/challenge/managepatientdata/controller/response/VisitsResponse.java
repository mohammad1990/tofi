package com.tofi.challenge.managepatientdata.controller.response;


import com.tofi.challenge.managepatientdata.model.visit.imp.Visit;

import java.util.stream.Collectors;
import java.util.List;

public class VisitsResponse {
    private List<String> visits;

    public VisitsResponse(List<Visit> visits) {
        this.visits = visits.stream().map(Visit::getVisitType).collect(Collectors.toList());
    }
}
