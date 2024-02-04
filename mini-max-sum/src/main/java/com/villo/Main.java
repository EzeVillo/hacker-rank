package com.villo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        miniMaxSum(Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625));
    }

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        Collections.sort(arr);
        // I don't want to pass the list to long because it is not necessary
        /* arr.stream().mapToLong(number -> number).reduce(Long::sum).ifPresent((number) ->
                System.out.println(number - arr.get(arr.size() - 1) + " " + (number - arr.get(0))));*/

        long acum = 0;

        for (int i : arr)
            acum += i;

        System.out.println(acum - arr.get(arr.size() - 1) + " " + (acum - arr.get(0)));
    }
}