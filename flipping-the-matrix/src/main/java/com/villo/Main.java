package com.villo;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(flippingMatrix(Arrays.asList(
                Arrays.asList(112, 42, 83, 119),
                Arrays.asList(56, 125, 56, 49),
                Arrays.asList(15, 78, 101, 43),
                Arrays.asList(62, 98, 114, 108))));
    }

    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here

        int sum = 0;
        int size = matrix.size();
        for (int i = 0; i < size / 2; i++)
            for (int j = 0; j < size / 2; j++)
                sum += Math.max(matrix.get(i).get(j),
                        Math.max(matrix.get(i).get(size - 1 - j),
                                Math.max(matrix.get(size - 1 - i).get(j),
                                        matrix.get(size - 1 - i).get(size - 1 - j))));

        return sum;
    }
}