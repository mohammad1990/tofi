package com.tofi.challenge.managepatientdata.model.patient.imp;

import com.tofi.challenge.managepatientdata.model.EntityUtils;
import com.tofi.challenge.managepatientdata.model.entity.PatientEntity;
import com.tofi.challenge.managepatientdata.model.AbstractPanacheRepository;
import com.tofi.challenge.managepatientdata.model.patient.IPatientRepository;
import lombok.AllArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;
import java.util.UUID;

@ApplicationScoped
@AllArgsConstructor
public class PatientRepository extends AbstractPanacheRepository<PatientEntity, UUID> implements IPatientRepository {
    private final EntityUtils entityUtils;

    @Override
    public void save(Patient patient) {
        persist(new PatientEntity(patient));
    }

    @Override
    public Optional<Patient> findPatientById(UUID id) {
        return findByIdOptional(id).map(entityUtils::patient);
    }
}
