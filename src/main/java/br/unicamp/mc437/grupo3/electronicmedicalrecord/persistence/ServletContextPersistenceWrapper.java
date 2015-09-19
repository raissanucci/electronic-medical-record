package br.unicamp.mc437.grupo3.electronicmedicalrecord.persistence;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletContext;

public class ServletContextPersistenceWrapper {
    public ServletContextPersistenceWrapper(ServletContext contextBeingWrapped) {
        this.contextBeingWrapped = contextBeingWrapped;
    }
    private ServletContext contextBeingWrapped;


    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        contextBeingWrapped.setAttribute(ENTITY_MANAGER_FACTORY_ATTRIBUTE, entityManagerFactory);
    }
    public EntityManagerFactory getEntityManagerFactory() {
        return (EntityManagerFactory) contextBeingWrapped.getAttribute(ENTITY_MANAGER_FACTORY_ATTRIBUTE);
    }
    public void removeEntityManagerFactory() {
        contextBeingWrapped.setAttribute(ENTITY_MANAGER_FACTORY_ATTRIBUTE, null);
    }
    private static final String ENTITY_MANAGER_FACTORY_ATTRIBUTE = "entityManagerFactory";
}