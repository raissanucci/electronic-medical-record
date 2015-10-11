package br.unicamp.mc437.grupo3.electronicmedicalrecord.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by raissanucci on 10/11/15.
 */
@Entity

public class AuditoryTrail {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private AuditoryEvent event;

    @Enumerated(EnumType.STRING)
    private SystemUser user;

    @Temporal(TemporalType.TIMESTAMP)
    private Date eventDate;

    public AuditoryTrail(AuditoryEvent event, Date eventDate) {
        this.event = event;
        this.eventDate = eventDate;
        this.user = SystemUser.RECEPCIONIST;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AuditoryEvent getEvent() {
        return event;
    }

    public void setEvent(AuditoryEvent event) {
        this.event = event;
    }

    public SystemUser getUser() {
        return user;
    }

    public void setUser(SystemUser user) {
        this.user = user;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }
}
