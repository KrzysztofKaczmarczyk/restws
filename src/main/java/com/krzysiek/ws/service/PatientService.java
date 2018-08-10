package com.krzysiek.ws.service;

import com.krzysiek.ws.model.Patient;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/patientservice")
@Service
public interface PatientService {

	@GET
	@Path("/patients")
	List<Patient> getPatients();

	@GET
	@Path("/patients/{id}")
	Patient getPatients(@PathParam(value = "id") Long id);

	@POST
	@Path("/patients")
	Response creatPatient(Patient patient);

	@PUT
	@Path("/patients")
	Response updatePatient(Patient patient);

	@DELETE
	@Path("/patients/{id}")
	Response deletePatient(@PathParam(value = "id") Long id);

}
