package com.villo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(twoArrays(10, Arrays.asList(2, 1, 3), Arrays.asList(7, 8, 9)));
    }

    /*
     * Complete the 'twoArrays' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY A
     *  3. INTEGER_ARRAY B
     */

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here

        Collections.sort(A);
        B.sort(Collections.reverseOrder());

        for (int i = 0; i < A.size(); i++)
            if (A.get(i) + B.get(i) < k) return "NO";

        return "YES";
    }
}