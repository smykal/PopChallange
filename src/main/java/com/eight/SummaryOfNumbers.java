package com.eight;

import java.util.Iterator;
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
        }

        return (LinkedList) list;
    }

    @Override
    public void printList(LinkedList linkedList) {
        System.out.print("list contains: ");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + ", ");
        }
    }

    @Override
    public int summaryList(LinkedList linkedList) {
        int sum = 0;
        System.out.println("");
        for (int i = 0; i < linkedList.size(); i++) {
            sum = sum + (int) linkedList.get(i);
        }
        System.out.print("summary of list by for each loop: " + sum);
        return sum;
    }

}
