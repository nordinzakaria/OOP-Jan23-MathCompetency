package com.example.mathcompetencysurvey;

public class PartimeExaminer {
    private String name;
    private String id;
    private int dailyrate;
    private int numdays;

    public PartimeExaminer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public int getDailyrate() {
        return dailyrate;
    }

    public void setDailyrate(int dailyrate) {
        this.dailyrate = dailyrate;
    }

    public int getNumdays() {
        return numdays;
    }

    public void setNumdays(int numdays) {
        this.numdays = numdays;
    }

    public float calcPay() {
        return 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
