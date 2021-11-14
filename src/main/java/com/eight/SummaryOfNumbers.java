package com.eight;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SummaryOfNumbers implements SummaryRecursion {
    @Override
    public LinkedList generateList(int listSize, int min, int max) {
        List list = new LinkedList();
        GetRandomNumber getRandomNumber = new GetRandomNumber();

        for (int i = 0; i < listSize; i++) {
            list.add(getRandomNumber.getRandomNumber(min, max));
            System.out.println(list.get(i));
        }

        return (LinkedList) list;
    }
}
