package br.unicamp.mc437.grupo3.electronicmedicalrecord.persistence.repository;

import br.unicamp.mc437.grupo3.electronicmedicalrecord.model.Patient;

import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Singleton
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

    public List<Patient> all() {
        TypedQuery<Patient> query = entityManager.createQuery("SELECT p FROM Patient p", Patient.class);
        List<Patient> patients = query.getResultList();
        return patients;
    }

    public void remove(Patient patient) {
        entityManager.remove(patient);
    }

    public List<Patient> queryByCPF(String cpf) {
        final TypedQuery<Patient> query = entityManager.createQuery("SELECT p FROM Patient p WHERE p.cpf = :cpf", Patient.class);
        query.setParameter("cpf", cpf);
        final List<Patient> patients = query.getResultList();
        return patients;
    }
}
