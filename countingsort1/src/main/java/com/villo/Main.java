package com.villo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(countingSort(Arrays.asList(1, 1, 3, 2, 1)));
    }

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < 100; i++)
            result.add(0);

        for (int i : arr)
            result.set(i, result.get(i) + 1);

        return result;
    }
}