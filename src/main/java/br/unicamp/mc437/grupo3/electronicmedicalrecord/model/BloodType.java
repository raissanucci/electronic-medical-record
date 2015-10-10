package br.unicamp.mc437.grupo3.electronicmedicalrecord.model;

/**
 * Created by raissanucci on 10/9/15.
 */
public enum BloodType {
    A_POSITIVO("A+"),
    A_NEGATIVO("A-"),
    AB_POSITIVO("AB+"),
    AB_NEGATIVO("AB-"),
    B_POSITVO("B+"),
    B_NEGATIVO("B-"),
    O_POSITIVO("O+");

    private final String description;

    private BloodType(String description) {
        this.description = description;
    }

    public String getDescrition() {
        return description;
    }

    public static BloodType findBloodTypeByDescription(String description) {
        for(BloodType bloodType : BloodType.values()) {
            if(bloodType.getDescrition().toLowerCase().equals(description.toLowerCase())) {
                return bloodType;
            }
        }

        return null;
    }
}
