package com.villo;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(breakingRecords(Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1)));
    }

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here

        int maxScore = scores.get(0);
        int minScore = scores.get(0);
        int maxCount = 0;
        int minCount = 0;

        for (int score : scores) {
            if (maxScore < score) {
                maxScore = score;
                maxCount++;
            } else if (minScore > score) {
                minScore = score;
                minCount++;
            }
        }

        return Arrays.asList(maxCount, minCount);
    }
}