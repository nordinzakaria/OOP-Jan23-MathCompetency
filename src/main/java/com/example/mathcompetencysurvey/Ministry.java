package com.example.mathcompetencysurvey;

import java.util.ArrayList;

public class Ministry {
    private String year;
    protected static String ministryname;
    // attributes
    private DSchoolList schoollist;
    private String pic;
    private ArrayList<Examiner> examiners = new ArrayList<Examiner>();

    public Ministry(String pic) {
        this.pic = pic;
    }

    public Examiner getExaminer(int i) {
        return examiners.get(i);
    }
    public void addExaminer(Examiner examiner) {
        examiners.add(examiner);
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
        Ministry.ministryname = ministryname;
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

        Ministry.setMinistryname("MOE");

        // application test code
        Ministry ministry21 = new Ministry("Abdul Majid");
        ministry21.setYear("2021");

        // Task: add 1 examiner to ministry21
        Examiner examiner = new Examiner("Ali", "5155");
        ministry21.addExaminer(examiner);

        Ministry ministry22 = new Ministry("Abdul Sattar");
        ministry22.setYear("2022");

        System.out.println("Ministry name for y 2021: "+
                ministry21.getMinistryname());
        System.out.println("Ministry name for y 2022: "+
                ministry22.getMinistryname());


    }
}
