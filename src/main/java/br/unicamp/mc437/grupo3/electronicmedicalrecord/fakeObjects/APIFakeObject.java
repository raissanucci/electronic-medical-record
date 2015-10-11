package br.unicamp.mc437.grupo3.electronicmedicalrecord.fakeObjects;

/**
 * Created by raissanucci on 10/11/15.
 */
import br.unicamp.mc437.grupo3.electronicmedicalrecord.model.Patient;
import br.unicamp.mc437.grupo3.electronicmedicalrecord.persistence.repository.PatientRepository;
import groovyjarjarantlr.collections.List;

import javax.ws.rs.core.Response;

public class APIFakeObject {
    PatientRepository patientRepository;

    public APIFakeObject() {
        super();
        patientRepository = new PatientRepository();
    }

    public boolean check_patient_is_registered(String cpf) {
        final java.util.List<Patient> byCPF = patientRepository.queryByCPF(cpf);
        if (!byCPF.isEmpty()) {
           return true;
        }

        return false;
    }

    public Response insert_correctly_on_DB() {
        return Response.status(200).type("application/json").entity("Success").build();
    }

    public Response insert_badly_on_DB() {
        return Response.status(400).type("application/json").entity("Error: Patient already exists").build();
    }
}
