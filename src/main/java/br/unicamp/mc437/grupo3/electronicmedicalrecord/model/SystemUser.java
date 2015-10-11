package br.unicamp.mc437.grupo3.electronicmedicalrecord.model;

/**
 * Created by raissanucci on 10/11/15.
 */
public enum SystemUser {
    RECEPCIONIST(1234, "Recepcionist");

    private final int id;
    private final String description;

    private SystemUser(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return  id;
    }

    public String getDescription() {
        return description;
    }
}
