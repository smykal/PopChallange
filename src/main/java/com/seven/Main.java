package com.seven;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Metods chars = new SeparateEverySecondChar();
        char[] konstantynopol = chars.splitStringForChars("Konstantynopol");
        chars.printEachSecondChar(konstantynopol);
        chars.printEachChosenChar(konstantynopol, 3);
        System.out.println("**********************");
        Summary summary = new Summary();
        List list = summary.generateList(10);
        double v = summary.summaryList(list);
        System.out.println(v);
    }
}
