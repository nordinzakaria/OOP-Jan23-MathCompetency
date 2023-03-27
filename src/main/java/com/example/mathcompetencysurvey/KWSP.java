package com.example.mathcompetencysurvey;

import java.util.ArrayList;

public class KWSP {
    private ArrayList<EPFContributor> contributors = new ArrayList<EPFContributor>();

    public void addContributor(EPFContributor contrib) {
        contributors.add(contrib);
    }

    public float calcTotalContrib() {
        float sum = 0;
        for (int i=0; i<contributors.size(); i++) {
            sum += contributors.get(i).calcEPFcontribution();
        }
        return sum;
    }
}
