package com.example.mathcompetencysurvey;

public class FulltimeExaminer {
    private String name;
    private String id;
    private int monthlypay;


    public FulltimeExaminer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public int getMonthlypay() {
        return monthlypay;
    }

    public void setMonthlypay(int monthlypay) {
        this.monthlypay = monthlypay;
    }

    public float calcPay() {
        return getMonthlypay();
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
