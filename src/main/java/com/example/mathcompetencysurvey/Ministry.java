package com.example.mathcompetencysurvey;

public class Ministry {
    private String year;
    protected static String ministryname;
    // attributes
    private DSchoolList schoollist;
    private String pic;

    public Ministry(String pic) {
        this.pic = pic;
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

        Ministry ministry22 = new Ministry("Abdul Sattar");
        ministry22.setYear("2022");

        System.out.println("Ministry name for y 2021: "+
                ministry21.getMinistryname());
        System.out.println("Ministry name for y 2022: "+
                ministry22.getMinistryname());

    }
}
