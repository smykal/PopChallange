package com.six;

public class AddArrays {
    public void addArrays(int[][] array1, int[][]array2) {
        if (compareArraysSize(array1,array2) == true) {
            int[][] resultArray = new int[array1.length][array1[0].length];
            for (int i = 0; i < resultArray.length; i++) {
                for (int j = 0; j < resultArray[i].length; j++) {
                    resultArray[i][j] = array1[i][j] + array2[i][j];
                }
            }
            printArray(resultArray);
        } else {
            System.out.println("arrays sizes not equals");
        }
    }

    public boolean compareArraysSize(int[][] array1, int[][] array2) {
        boolean result = true;
        int lengthArray1N = array1.length;
        int lengthArray2N = array2.length;
        int lengthArray1M = array1[0].length;
        int lengthArray2M = array2[0].length;
        if (lengthArray1M == lengthArray2M && lengthArray1N == lengthArray2N) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();
    }
}
