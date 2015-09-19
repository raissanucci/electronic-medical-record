package br.unicamp.mc437.grupo3.electronicmedicalrecord.resource;

import br.unicamp.mc437.grupo3.electronicmedicalrecord.model.Patient;
import br.unicamp.mc437.grupo3.electronicmedicalrecord.persistence.ServletContextPersistenceWrapper;
import br.unicamp.mc437.grupo3.electronicmedicalrecord.persistence.repository.PatientRepository;

import javax.persistence.EntityManager;
import javax.servlet.ServletContext;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/patient")
public class PatientResource {
    @Context
    private ServletContext servletContext;

    @GET
    @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String get(@PathParam("id") Integer patientId) {
        ServletContextPersistenceWrapper servletContextPersistenceWrapper = new ServletContextPersistenceWrapper(servletContext);
        // TODO: There should typically be only one EntityManager per application. This is totally and completely wrong and should be temporary.
        EntityManager entityManager = servletContextPersistenceWrapper.getEntityManagerFactory().createEntityManager();
        PatientRepository patientRepository = new PatientRepository(entityManager);
        Patient patient = patientRepository.get(patientId);
        return patient.getName();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String post(@FormParam("name") String patientName) {
        ServletContextPersistenceWrapper servletContextPersistenceWrapper = new ServletContextPersistenceWrapper(servletContext);
        // TODO: There should typically be only one EntityManager per application. This is totally and completely wrong and should be temporary.
        EntityManager entityManager = servletContextPersistenceWrapper.getEntityManagerFactory().createEntityManager();
        PatientRepository patientRepository = new PatientRepository(entityManager);
        Patient patient = new Patient(patientName);
        patientRepository.add(patient);
        return patientName;
    }
}
