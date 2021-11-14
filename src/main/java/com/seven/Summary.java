package com.seven;

import java.util.ArrayList;
import java.util.List;

public class Summary implements SummaryMethods {
    @Override
    public List generateList(int listSize) {
        List list = new ArrayList(listSize);
        for (int i = 0; i < listSize; i++) {
            double random = Math.random();
            list.add(random);
        }
        return list;
    }

    @Override
    public double summaryList(List list) {
        double summary = 0;
        for (int i = 0; i < list.size(); i++) {
            summary = summary + (double) list.get(i);
        }
        return summary;
    }

}
