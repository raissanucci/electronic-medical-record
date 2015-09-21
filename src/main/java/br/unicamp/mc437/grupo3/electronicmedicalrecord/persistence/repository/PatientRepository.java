package br.unicamp.mc437.grupo3.electronicmedicalrecord.persistence.repository;

import br.unicamp.mc437.grupo3.electronicmedicalrecord.model.Patient;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PatientRepository {
    @PersistenceContext(unitName = "development")
    private EntityManager entityManager;

    public void add(Patient patient) {
        entityManager.persist(patient);
    }

    public Patient get(Integer patientId) {
        Patient patient = entityManager.find(Patient.class, patientId);
        return patient;
    }
}
