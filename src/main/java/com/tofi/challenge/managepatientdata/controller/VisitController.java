package com.tofi.challenge.managepatientdata.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tofi.challenge.managepatientdata.constants.ValidationMessages;
import com.tofi.challenge.managepatientdata.controller.request.NewVisitRequest;
import com.tofi.challenge.managepatientdata.controller.response.VisitResponse;
import com.tofi.challenge.managepatientdata.model.visit.imp.Visit;
import com.tofi.challenge.managepatientdata.service.ICreateVisit;
import com.tofi.challenge.managepatientdata.service.IFindPatientVisitsById;
import lombok.AllArgsConstructor;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.UUID;
import java.util.List;


@Path("/visit")
@AllArgsConstructor

public class VisitController {
    private final ICreateVisit createVisit;
    private final IFindPatientVisitsById findPatientVisitById;

    ObjectMapper objectMapper;

    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(@Valid @NotNull(message = ValidationMessages.REQUEST_BODY_MUST_BE_NOT_NULL) NewVisitRequest newVisitRequest){
        final var visit = createVisit.handle(newVisitRequest.toCreateVisitInput());
        return  Response.ok(new VisitResponse(visit)).status(Response.Status.CREATED).build();
    }


    @GET
    @Path("visits/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getVisits(@PathParam("id") @NotBlank(message = ValidationMessages.ID_MUST_BE_NOT_BLANK)
                                       String id){
        final var patientId = UUID.fromString(id);
        List<Visit> visits  = findPatientVisitById.handle(patientId);
        return Response.ok(visits).status(Response.Status.CREATED).build();
    }

}
