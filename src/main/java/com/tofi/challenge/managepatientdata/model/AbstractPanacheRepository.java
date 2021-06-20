package com.tofi.challenge.managepatientdata.model;

import com.tofi.challenge.managepatientdata.model.entity.PatientEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.UUID;

public class AbstractPanacheRepository<ENTITY, ID> implements PanacheRepositoryBase<ENTITY, ID> {
    protected PatientEntity findPatientEntityById(UUID id) {
        return getEntityManager().find(PatientEntity.class, id);
    }
}
