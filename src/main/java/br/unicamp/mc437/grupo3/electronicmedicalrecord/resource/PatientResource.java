package br.unicamp.mc437.grupo3.electronicmedicalrecord.resource;

import br.unicamp.mc437.grupo3.electronicmedicalrecord.model.AuditoryEvent;
import br.unicamp.mc437.grupo3.electronicmedicalrecord.model.AuditoryTrail;
import br.unicamp.mc437.grupo3.electronicmedicalrecord.model.Patient;
import br.unicamp.mc437.grupo3.electronicmedicalrecord.persistence.repository.AuditoryTrailRepository;
import br.unicamp.mc437.grupo3.electronicmedicalrecord.persistence.repository.PatientRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Date;
import java.util.EventListener;
import java.util.List;

@Singleton
@Path("/patients")
public class PatientResource {
    @EJB
    private PatientRepository patientRepository;

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public String get(@PathParam("id") Integer patientId) throws JsonProcessingException {
        Patient patient = patientRepository.get(patientId);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(patient);
    }

    @GET
    @Produces("application/json")
    public String allPatients() throws JsonProcessingException {
        List<Patient> patients = patientRepository.all();
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(patients);
    }

//    {
//        "$schema": "http://json-schema.org/draft-03/schema",
//            "properties": {
//        "name": {"type": "string"},
//        "socialName": {"type": "string"},
//        "mothersName": {"type": "string"},
//        "fathersName": {"type": "string"},
//        "gender": {"type": "string"},
//        "color": {"type": "string"},
//        "birthdate": {"type": "string"},
//        "bloodtype": {"type": "string"},
//        "email": {"type": "string"},
//        "cpf": {"type": "string"},
//        "rg": {"type": "string"},
//        "orgEmissor": {"type": "string"},
//        "orgEmissorUF": {"type": "string"},
//        "ddd": {"type": "string"},
//        "phone": {"type": "string"},
//        "zip": {"type": "string"},
//        "address": {"type": "string"},
//        "addressNumber": {"type": "string"},
//        "addressComplement": {"type": "string"},
//        "addressCityArea": {"type": "string"},
//        "addressCity": {"type": "string"},
//        "addressUF": {"type": "string"},
//        "addressCountry": {"type": "string"}
//    },
//        "required": ["name"],
//        "type": "object"
//    }


    @POST
    public Response post(@FormParam("name") String name,
                       @FormParam("socialName") String socialName,
                       @FormParam("mothersName") String mothersName,
                       @FormParam("fathersName") String fathersName,
                       @FormParam("gender") String gender,
                       @FormParam("color") String color,
                       @FormParam("birthdate") String birthDate,
                       @FormParam("bloodtype") String bloodType,
                       @FormParam("email") String email,
                       @FormParam("cpf") String cpf,
                       @FormParam("rg") String rg,
                       @FormParam("orgEmissor") String orgEmissor,
                       @FormParam("orgEmissorUF") String orgEmissorUF,
                       @FormParam("ddd") String ddd,
                       @FormParam("phone") String phone,
                       @FormParam("zip") String zip,
                       @FormParam("address") String address,
                       @FormParam("addressNumber") String addressNumber,
                       @FormParam("addressComplement") String addressComplement,
                       @FormParam("addressCityArea") String addressCityArea,
                       @FormParam("addressCity") String addressCity,
                       @FormParam("addressUF") String addressUF,
                       @FormParam("addressCountry") String addressCountry) {
        final List<Patient> byCPF = patientRepository.queryByCPF(cpf);
        if (!byCPF.isEmpty()) {
            return Response.status(400).build();
        }

        Patient patient = new Patient();
        patient.setName(name);
        patient.setSocialName(socialName);
        patient.setMothersName(mothersName);
        patient.setFathersName(fathersName);
        patient.setGender(gender);
        patient.setColor(color);
        patient.setBirthDate(birthDate);
        patient.setBloodType(bloodType);
        patient.setEmail(email);
        patient.setCpf(cpf);
        patient.setRg(rg);
        patient.setIssuerOrgan(orgEmissor);
        patient.setIssuerOrganUF(orgEmissorUF);
        patient.setDdd(ddd);
        patient.setPhoneNumber(phone);
        patient.setCep(zip);
        patient.setAddressStreet(address);
        patient.setAddressNumber(addressNumber);
        patient.setAddressComplement(addressComplement);
        patient.setAddressCityArea(addressCityArea);
        patient.setAddressCity(addressCity);
        patient.setAddressUF(addressUF);
        patient.setAddressCountry(addressCountry);

        patientRepository.add(patient);

        AuditoryTrailRepository auditoryTrailRepository = new AuditoryTrailRepository();
        AuditoryTrail auditoryTrail = new AuditoryTrail(AuditoryEvent.CREATE_PATIENT, new Date());

        auditoryTrailRepository.addAuditoryTrail(auditoryTrail);
        
        return Response.status(200).build();
    }
}
