package br.unicamp.mc437.grupo3.electronicmedicalrecord.fakeObjects;

/**
 * Created by raissanucci on 10/11/15.
 */
import javax.ws.rs.core.Response;

public class APIFakeObject {

    public APIFakeObject() {
        super();
    }

    public Response insert_correctly_on_DB() {
        return Response.status(200).type("application/json").entity("Success").build();
    }

    public Response insert_badly_on_DB() {
        return Response.status(400).type("application/json").entity("Error: Patient already exists").build();
    }
}
