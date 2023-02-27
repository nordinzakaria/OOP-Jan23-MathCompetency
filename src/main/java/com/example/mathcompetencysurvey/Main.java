package com.example.mathcompetencysurvey;

public class Main {
    // Application code
    public static void main(String args[]) {
        School sk1 = new School();

        // Direct access to attributes is not a good practices
        sk1.setName("SK Satu");

        Address addr = new Address();
        addr.setStreet("Jalan 2");
        addr.setDistrict("JB");
        addr.setPostcode("30021");
        addr.setState("Johor");
        sk1.setAddress(addr);


        System.out.println("Name of school is "+sk1.getName());

        Marks marks = new Marks(100);

        try {
            marks.setMark(-50, 0);
        }
        catch (Exception ex) {
            System.out.print("Marks must be positive");
            ex.printStackTrace();
        }

        float mark = marks.getMark(0);
        System.out.println("Marks for student 0 is " + mark);
    }
}
