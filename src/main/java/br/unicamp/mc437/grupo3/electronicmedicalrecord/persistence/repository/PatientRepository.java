package br.unicamp.mc437.grupo3.electronicmedicalrecord.persistence.repository;

import br.unicamp.mc437.grupo3.electronicmedicalrecord.model.Patient;

import javax.persistence.EntityManager;

public class PatientRepository {
    private EntityManager entityManager;

    public PatientRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void add(Patient patient) {
        entityManager.getTransaction().begin();
        entityManager.persist(patient);
        entityManager.getTransaction().commit();
    }

    public Patient get(Integer patientId) {
        entityManager.getTransaction().begin();
        Patient patient = entityManager.find(Patient.class, patientId);
        entityManager.getTransaction().commit();
        return patient;
    }
}
