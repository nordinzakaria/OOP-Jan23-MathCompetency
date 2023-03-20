package com.example.mathcompetencysurvey;

// an abstract class is one which is incomplete
public abstract class Examiner {
    private String name;
    private String id;

    public Examiner(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    // abstract method = no body
    public abstract float calcPay();

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
