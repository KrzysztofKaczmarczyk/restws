package com.krzysiek.ws.service;

import com.krzysiek.ws.model.Patient;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;
import java.util.*;

@Service
public class PatnientServiceImp implements PatientService {

	Map<Long, Patient> patients = new HashMap<>();
	long currentID = 123L;

	public PatnientServiceImp() {

		init();

	}

	void init() {
		Patient patient = new Patient();
		patient.setId(currentID);
		patient.setName("John");
		patients.put(patient.getId(), patient);
	}

	@Override
	public List<Patient> getPatients() {
		Collection<Patient> resutls = patients.values();
		ArrayList<Patient> response = new ArrayList<>(resutls);
		return response;
	}

	@Override
	public Patient getPatients(Long id) {
		return patients.get(id);
	}

	@Override
	public Response creatPatient(Patient patient) {
		patient.setId(++currentID);
		patients.put(patient.getId(), patient);
		return Response.ok(patient).build();
	}

	@Override
	public Response updatePatient(Patient patient) {

		Patient currentPatient = patients.get(patient.getId());
		Response response;
		if (currentPatient != null) {
			patients.put(patient.getId(), patient);
			return Response.ok().build();
		} else {
			return Response.notModified().build();
		}
	}

	@Override
	public Response deletePatient(Long id) {
		Patient currentPatient = patients.get(id);
		Response response;
		if (currentPatient != null) {
			patients.remove(id);
			response = Response.ok().build();

		} else {
			response = Response.notModified().build();
		}
		return response;
	}

}
