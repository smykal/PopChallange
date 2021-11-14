package com.seven;

public class SeparateEverySecondChar implements Metods{
    @Override
    public char[] splitStringForChars(String string) {
        return string.toCharArray();
    }

    @Override
    public void printEachSecondChar(char[] charTable) {
        for (int i = 0; i*2 < charTable.length; i++) {
            System.out.print(charTable[2*i]);
        }
        System.out.println();
    }

    @Override
    public void printEachChosenChar(char[] charTable, int chosenChar) {
        for (int i = 0; i*chosenChar < charTable.length; i++) {
            System.out.print(charTable[i*chosenChar]);
        }
        System.out.println();
    }


}
