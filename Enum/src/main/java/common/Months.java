package common;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Months {
    JANUARY ("January"),
    FEBRUARY ("February"),
    MARCH ("March"),
    APRIL ("April"),
    MAY ("May"),
    JUNE ("June"),
    JULY ("July"),
    AUGUST ("August"),
    SEPTEMBER ("September"),
    OCTOBER ("October"),
    NOVEMBER ("November"),
    DECEMBER ("December");


    private String englishName;

    Months(String englishName) {
        this.englishName = englishName;
    }

    @JsonValue
    public String getEnglishName() {
        return englishName;
    }
}
