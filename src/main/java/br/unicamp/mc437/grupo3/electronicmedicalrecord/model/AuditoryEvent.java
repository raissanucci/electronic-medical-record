package br.unicamp.mc437.grupo3.electronicmedicalrecord.model;

/**
 * Created by raissanucci on 10/11/15.
 */
public enum AuditoryEvent {
    CREATE_PATIENT("Create patient");

    private final String description;

    private AuditoryEvent(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static AuditoryEvent findAuditoryEventByDescription(String description) {
        for(AuditoryEvent auditoryEvent : AuditoryEvent.values()) {
            if(auditoryEvent.getDescription().toLowerCase().equals(description.toLowerCase())) {
                return auditoryEvent;
            }
        }

        return null;
    }
}
