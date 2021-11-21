package com.six;

public class Main {
    public static void main(String[] args) {
        GetArray getArray1 = new GetArray();
        int[][] array = getArray1.getArray();
        getArray1.insertValuesToArray(array);

        GetArray getArray2 = new GetArray();
        int[][] array2 = getArray2.getArray();
        getArray2.insertValuesToArray(array2);

        MultipleArrays multipleArrays = new MultipleArrays();
        multipleArrays.multipleArrays(array,array2);
    }
}
