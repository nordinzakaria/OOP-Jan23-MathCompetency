package com.example.mathcompetencysurvey;

// this is a subclass that inherits from superclass Examiner
public class FulltimeExaminer extends Examiner {
    private int monthlypay;

    public FulltimeExaminer(String name, String id) {
        super(name, id);    // invoke constructor for superclass
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

}
