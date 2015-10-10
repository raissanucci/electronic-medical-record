package br.unicamp.mc437.grupo3.electronicmedicalrecord.model;


import java.lang.reflect.Array;

/**
 * Created by raissanucci on 10/9/15.
 */
public enum Color {
    WHITE(1, "Branca"),
    BLACK(2, "Negra"),
    YELLOW(3, "Amarela"),
    RED(4, "Parda"),
    INDIAN(5, "Indigena"),
    UNKNOWN(99, "Sem informação");

    private final int code;
    private final String description;

    private Color(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static Color findColorByDescription(String description) {
        for(Color color : Color.values()) {
            if(description.toLowerCase().equals(color.getDescription().toLowerCase())) {
                return color;
            }
        }

        return null;
    }

    public static Color findColorByIndex(int index) {
        for(Color color : Color.values()) {
            if(color.ordinal() == index) {
                return color;
            }
        }

        return null;
    }
}
