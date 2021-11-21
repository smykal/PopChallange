package com.six;

import java.util.ArrayList;
import java.util.Scanner;

public class GetArray {
    public int[][] getArray() {
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj rozmiar \"n\" tablicy");
        int n = scanner.nextInt();
        System.out.println("podaj rozmiar \"m\" tablicy");
        int m = scanner.nextInt();
        array = new int[m][n];
        printArray(array);
        return array;
    }

    public void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }

    public void insertValuesToArray(int[][] array) {
        
    }
}
