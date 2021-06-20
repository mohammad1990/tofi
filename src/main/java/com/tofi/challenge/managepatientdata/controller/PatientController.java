package com.tofi.challenge.managepatientdata.controller;

import com.tofi.challenge.managepatientdata.constants.ValidationMessages;

import javax.transaction.Transactional;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.tofi.challenge.managepatientdata.controller.request.NewPatientRequest;
import com.tofi.challenge.managepatientdata.controller.response.PatientResponse;
import com.tofi.challenge.managepatientdata.service.IFindPatientById;
import com.tofi.challenge.managepatientdata.service.ICreatePatient;
import lombok.AllArgsConstructor;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.UUID;

@Path("/patient")
@AllArgsConstructor
public class PatientController {


    private final ICreatePatient createPatient;
    private final IFindPatientById findPatientById;

    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(@Valid @NotNull(message = ValidationMessages.REQUEST_BODY_MUST_BE_NOT_NULL) NewPatientRequest newPatientRequest){
        final var patient = createPatient.handle(newPatientRequest.toCreatePatientInput());
        return  Response.ok(new PatientResponse(patient)).status(Response.Status.CREATED).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPatient(@PathParam("id") @NotBlank(message = ValidationMessages.ID_MUST_BE_NOT_BLANK)
                                           String id){
        final var patientId = UUID.fromString(id);
        final var patient = findPatientById.handle(patientId);
      //  final var patient = createPatient.handle(newPatientRequest.toCreatePatientInput());
        return Response.ok(new PatientResponse(patient)).status(Response.Status.CREATED).build();
    }

}
