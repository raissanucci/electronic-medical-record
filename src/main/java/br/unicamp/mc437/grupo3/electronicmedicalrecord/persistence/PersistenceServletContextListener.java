package br.unicamp.mc437.grupo3.electronicmedicalrecord.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class PersistenceServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        putAnEntityManagerFactoryIntoTheServletContext(servletContextEvent.getServletContext());
    }
    private void putAnEntityManagerFactoryIntoTheServletContext(ServletContext servletContext) {
        EntityManagerFactory entityManagerFactoryOfTheContext = Persistence.createEntityManagerFactory("test");
        ServletContextPersistenceWrapper contextWrapper = new ServletContextPersistenceWrapper(servletContext);
        contextWrapper.setEntityManagerFactory(entityManagerFactoryOfTheContext);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        destroyTheEntityManagerFactoryOfTheServletContext(servletContextEvent.getServletContext());
    }
    private void destroyTheEntityManagerFactoryOfTheServletContext(ServletContext servletContext) {
        ServletContextPersistenceWrapper contextWrapper = new ServletContextPersistenceWrapper(servletContext);
        EntityManagerFactory entityManagerFactoryOfTheContext = contextWrapper.getEntityManagerFactory();
        entityManagerFactoryOfTheContext.close();
        contextWrapper.removeEntityManagerFactory();
    }
}
