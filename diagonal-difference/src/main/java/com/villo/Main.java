package com.villo;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(diagonalDifference(Arrays.asList(
                Arrays.asList(11, 4, 10),
                Arrays.asList(2, 5, 8),
                Arrays.asList(4, 6, -12))));
    }

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < arr.size(); i++) {
            List<Integer> row = arr.get(i);
            primaryDiagonal += row.get(i);
            secondaryDiagonal += row.get(arr.size() - 1 - i);
        }

        return Math.abs(primaryDiagonal - secondaryDiagonal);
    }
}