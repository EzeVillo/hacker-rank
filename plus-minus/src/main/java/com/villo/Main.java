package com.villo;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1));
    }

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        int arraySize = arr.size();
        if (arraySize == 0) return;

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i : arr) {
            if (i > 0) {
                positiveCount++;
            } else if (i < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.printf("%.6f%n", (double) positiveCount / arr.size());
        System.out.printf("%.6f%n", (double) negativeCount / arr.size());
        System.out.printf("%.6f%n", (double) zeroCount / arr.size());
    }

}