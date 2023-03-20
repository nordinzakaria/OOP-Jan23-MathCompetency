package com.example.mathcompetencysurvey;

public class PartimeExaminer extends Examiner {
    private int dailyrate;
    private int numdays;

    public PartimeExaminer(String name, String id) {
        super(name, id);
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
        return this.dailyrate * this.numdays;
    }

}
