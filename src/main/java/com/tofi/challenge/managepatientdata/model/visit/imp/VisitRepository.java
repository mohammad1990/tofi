package com.tofi.challenge.managepatientdata.model.visit.imp;

import com.tofi.challenge.managepatientdata.model.AbstractPanacheRepository;
import com.tofi.challenge.managepatientdata.model.EntityUtils;
import com.tofi.challenge.managepatientdata.model.entity.VisitEntity;
import com.tofi.challenge.managepatientdata.model.visit.IVisitRepository;
import lombok.AllArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@ApplicationScoped
@AllArgsConstructor
public class VisitRepository extends AbstractPanacheRepository<VisitEntity, UUID> implements IVisitRepository {
    private final EntityUtils entityUtils;


    @Override
    public void save(Visit visit) {
        final var patient = findPatientEntityById(visit.getPatientId());
        persistAndFlush(new VisitEntity(visit,patient));

    }

    @Override
    public List<Visit> findPatientVisitsById(UUID id) {
        return listAll().stream().map(entityUtils::visit).collect(Collectors.toList());
    }


}
