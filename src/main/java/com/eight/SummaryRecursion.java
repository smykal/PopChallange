package com.eight;

import java.util.LinkedList;

public interface SummaryRecursion {
    public LinkedList generateList(int listSize, int min, int max);
    public void printList(LinkedList linkedList);
    public int summaryList(LinkedList linkedList);
    public int summaryRecursionList(LinkedList linkedList, int size);
}
