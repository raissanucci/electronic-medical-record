package br.unicamp.mc437.grupo3.electronicmedicalrecord.resource;

import br.unicamp.mc437.grupo3.electronicmedicalrecord.model.IssuerOrgan;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ejb.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by raissanucci on 10/9/15.
 */

@Singleton
@Path("/issuerOrgan")
public class IssuerOrganResource {

    @GET
    @Produces("application/json")
    public String allIssuerOrgans() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(IssuerOrgan.values());
    }
}
