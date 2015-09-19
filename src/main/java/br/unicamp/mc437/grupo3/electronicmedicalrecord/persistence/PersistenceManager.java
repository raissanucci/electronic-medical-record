package br.unicamp.mc437.grupo3.electronicmedicalrecord.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class PersistenceManager implements ServletContextListener {
    private static final PersistenceManager SINGLETON_INSTANCE = new PersistenceManager();

    public static getInstance() {
        return SINGLETON_INSTANCE;
    }

    private EntityManagerFactory entityManagerFactory;

    private PersistenceManager() {
        entityManagerFactory = Persistence.createEntityManagerFactory("test");
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
}
