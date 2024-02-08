package com.villo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(findMedian(Arrays.asList(5, 3, 1, 2, 4)));
    }

    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int findMedian(List<Integer> arr) {
        // Write your code here

        Collections.sort(arr);
        return arr.get(arr.size() / 2);
    }
}