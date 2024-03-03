package com.villo;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getTotalX(Arrays.asList(2, 6), Arrays.asList(24, 36)));
    }

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here

        int result = 0;

        int lowestCommonMultiple = a.get(0);
        for (Integer i : a)
            lowestCommonMultiple = getLowestCommonMultiple(lowestCommonMultiple, i);

        int greatestCommonMultiple = b.get(0);
        for (Integer i : b)
            greatestCommonMultiple = getGreatestCommonMultiple(greatestCommonMultiple, i);

        int multiple = 0;
        while (multiple <= greatestCommonMultiple) {
            multiple += lowestCommonMultiple;

            if (greatestCommonMultiple % multiple == 0)
                result++;
        }

        return result;
    }

    private static int getGreatestCommonMultiple(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getGreatestCommonMultiple(n2, n1 % n2);
    }

    private static int getLowestCommonMultiple(int n1, int n2) {
        if (n1 == 0 || n2 == 0)
            return 0;
        else {
            int greatestCommonMultiple = getGreatestCommonMultiple(n1, n2);
            return Math.abs(n1 * n2) / greatestCommonMultiple;
        }
    }
}