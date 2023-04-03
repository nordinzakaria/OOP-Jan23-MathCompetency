package com.example.mathcompetencysurvey;

public class MinisterInCharge {
    private String name;
    private static boolean ministerAppointed;

    private MinisterInCharge(String name) {
        this.name = name;
    }

    // Singleton pattern
    public static MinisterInCharge createMinister(String name) {
        if (ministerAppointed == false) {
            ministerAppointed = true;
            return new MinisterInCharge(name);
        }
        else {
            System.out.println("Berapa banyak dah..");
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
