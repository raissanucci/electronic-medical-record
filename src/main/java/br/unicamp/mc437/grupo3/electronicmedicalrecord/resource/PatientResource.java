package br.unicamp.mc437.grupo3.electronicmedicalrecord.resource;

import br.unicamp.mc437.grupo3.electronicmedicalrecord.model.Patient;
import br.unicamp.mc437.grupo3.electronicmedicalrecord.persistence.repository.PatientRepository;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/patient")
public class PatientResource {
    @GET
    @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String get(@PathParam("id") Integer patientId) {
        PatientRepository patientRepository = new PatientRepository();
        Patient patient = patientRepository.get(patientId);
        return patient.getName();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String post(@FormParam("name") String patientName) {
        PatientRepository patientRepository = new PatientRepository();
        Patient patient = new Patient(patientName);
        patientRepository.add(patient);
        return patientName;
    }
}
