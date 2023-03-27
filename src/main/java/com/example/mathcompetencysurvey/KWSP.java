package com.example.mathcompetencysurvey;

import java.util.ArrayList;

public class KWSP {
    private ArrayList<EPFContributorI> contributors = new ArrayList<EPFContributorI>();

    public void addContributor(EPFContributorI contrib) {
        contributors.add(contrib);
    }

    public float calcTotalContrib() {
        float sum = 0;
        for (int i=0; i<contributors.size(); i++) {
            sum += contributors.get(i).calcEPFcontribution();
        }
        return sum;
    }

    public static void main(String args[]) {
        KWSP kwsp = new KWSP();
        FulltimeExaminer examiner = new FulltimeExaminer("Ali", "122");
        kwsp.addContributor(examiner);

    }
}
