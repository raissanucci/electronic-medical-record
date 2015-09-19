package br.unicamp.mc437.grupo3.electronicmedicalrecord.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/patient")
public class PatientResource {
    @GET
    @Path("/name")
    @Produces(MediaType.TEXT_PLAIN)
    public String getName() {
        return "Fellipe Caetano";
    }
}
