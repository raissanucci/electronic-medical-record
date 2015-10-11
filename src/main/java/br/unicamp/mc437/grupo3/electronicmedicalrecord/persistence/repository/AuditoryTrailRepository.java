package br.unicamp.mc437.grupo3.electronicmedicalrecord.persistence.repository;

import br.unicamp.mc437.grupo3.electronicmedicalrecord.model.AuditoryTrail;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by raissanucci on 10/11/15.
 */
@Singleton
public class AuditoryTrailRepository {
    @PersistenceContext(unitName = "development")
    private EntityManager entityManager;

    public void addAuditoryTrail(AuditoryTrail auditoryTrail) {
        entityManager.persist(auditoryTrail);
    }
}
