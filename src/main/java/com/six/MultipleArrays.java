package com.six;

public class MultipleArrays {
    public void multipleArrays(int[][] array1, int[][] array2) {
        if (compareArraysSize(array1, array2) == true) {
            int[][] result = new int[array1.length][array1[0].length];
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    result[i][j] = countResult(array1,array2,i,j);
                }
            }
            printArray(array1);
            printArray(array2);
            printArray(result);
        } else {
            System.out.println("nieprawidłowy rozmiar mnożonych macierzy");
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

    public int countResult(int[][] array1, int[][] array2, int n, int m) {
        int result = 0;
        for (int i = 0; i < array1.length; i++) {
            result = result + array1[n][i] * array2[i][m];
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
