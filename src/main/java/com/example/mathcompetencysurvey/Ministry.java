package com.example.mathcompetencysurvey;

public class Ministry {
    private String year;
    private String ministryname;
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

    public String getMinistryname() {
        return ministryname;
    }

    public void setMinistryname(String ministryname) {
        this.ministryname = ministryname;
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
        // application test code

    }
}
