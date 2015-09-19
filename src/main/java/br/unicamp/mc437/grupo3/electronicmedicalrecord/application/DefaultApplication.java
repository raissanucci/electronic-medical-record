package br.unicamp.mc437.grupo3.electronicmedicalrecord.application;

import br.unicamp.mc437.grupo3.electronicmedicalrecord.resource.PatientResource;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by fellipe on 9/18/15.
 */
public class DefaultApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classesToBeRegistered = new HashSet<>();
        classesToBeRegistered.add(PatientResource.class);
        return classesToBeRegistered;
    }
}
