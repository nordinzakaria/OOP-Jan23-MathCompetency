package com.example.mathcompetencysurvey;

import java.util.ArrayList;

public class MinistrySurvey {
    private String year;
    protected static String ministryname;
    // attributes
    private DSchoolList schoollist;
    private String pic;

    // Inheritance allows polymorphism
    private ArrayList<Examiner> examiners = new ArrayList<Examiner>();
    public MinistrySurvey(String pic) {
        this.pic = pic;
    }

    public Examiner getExaminer(int i) {
        return examiners.get(i);
    }
    public void addExaminer(Examiner examiner) {
        examiners.add(examiner);
    }

    public float calcTotalPay() {
        float sum = 0;
        for (int i=0; i<examiners.size(); i++) {
            Examiner examiner = examiners.get(i);
            sum += examiner.calcPay(); // polymorphism
        }
        return sum;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public static String getMinistryname() {
        return ministryname;
    }

    public static void setMinistryname(String ministryname) {
        MinistrySurvey.ministryname = ministryname;
    }

    public DSchoolList getSchoollist() {
        return schoollist;
    }

    public void setSchoollist(DSchoolList schoollist) {
        this.schoollist = schoollist;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public static void main(String args[]) {

        MinistrySurvey.setMinistryname("MOE");

        // application test code
        MinistrySurvey ministry21 = new MinistrySurvey("Abdul Majid");
        ministry21.setYear("2021");

        // Task: add 1 examiner to ministry21
        FulltimeExaminer examiner = new FulltimeExaminer("Ali", "5155");
        ministry21.addExaminer(examiner);
        // inheritance allows for polymorphism

        float total = ministry21.calcTotalPay();
        System.out.println("Total for ministry21 is "+ total);

        MinistrySurvey ministry22 = new MinistrySurvey("Abdul Sattar");
        ministry22.setYear("2022");

        System.out.println("Ministry name for y 2021: "+
                ministry21.getMinistryname());
        System.out.println("Ministry name for y 2022: "+
                ministry22.getMinistryname());



    }
}
