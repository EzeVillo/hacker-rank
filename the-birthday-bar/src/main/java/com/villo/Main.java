package com.villo;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(birthday(Arrays.asList(2, 2, 1, 3, 2), 4, 2));
    }

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here

        int numberOfWays = 0;
        int sumOfSegment;

        for (int i = 0; i <= s.size() - m; i++) {
            sumOfSegment = s.subList(i, i + m).stream().mapToInt(Integer::intValue).sum();
            if (sumOfSegment == d)
                numberOfWays++;
        }

        return numberOfWays;
    }
}