package com.tofi.challenge.managepatientdata.service.imp;

import com.tofi.challenge.managepatientdata.model.visit.imp.Visit;
import com.tofi.challenge.managepatientdata.model.visit.imp.VisitRepository;
import com.tofi.challenge.managepatientdata.service.IFindPatientVisitsById;
import lombok.AllArgsConstructor;

import javax.inject.Singleton;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Singleton
public class FindPatientVisitsByIdImp implements IFindPatientVisitsById {
    private final VisitRepository visitRepository;

    @Override
    public List<Visit> handle(UUID id) {
        return visitRepository.findPatientVisitsById(id);
    }
}
