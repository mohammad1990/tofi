package com.tofi.challenge.managepatientdata.service;


import com.tofi.challenge.managepatientdata.model.visit.imp.CreateVisitInput;
import com.tofi.challenge.managepatientdata.model.visit.imp.Visit;

public interface ICreateVisit {
    Visit handle(CreateVisitInput createVisitInput);
}
