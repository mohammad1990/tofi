package com.tofi.challenge.managepatientdata.service.imp;

import com.tofi.challenge.managepatientdata.model.patient.imp.CreatePatientInput;
import com.tofi.challenge.managepatientdata.model.patient.imp.Patient;
import com.tofi.challenge.managepatientdata.model.patient.imp.PatientModelBuilder;
import com.tofi.challenge.managepatientdata.model.patient.imp.PatientRepository;
import com.tofi.challenge.managepatientdata.service.ICreatePatient;
import lombok.AllArgsConstructor;

import javax.inject.Singleton;

@AllArgsConstructor
@Singleton
public class CreatePatientImp implements ICreatePatient {

    private final PatientRepository patientRepository;
    private final PatientModelBuilder patientBuilder;


    @Override
   public Patient handle(CreatePatientInput createPatientInput) {
       final var patient = patientBuilder.build(
                createPatientInput.getName(),
                createPatientInput.getSurname(),
                 createPatientInput.getDateOfBirth(),
                createPatientInput.getSocialSecurityNumber());
        System.out.println("______________________");
       System.out.println(patient);
       patientRepository.save(patient);
      return patient;
   }

    private void checkExistingPatientSocialSecurityNumber(long socialSecurityNumber){
       /// TODO
    }
}
