package com.villo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(lonelyinteger(Arrays.asList(1, 1, 2)));
    }

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here

        Map<Integer, Integer> map = new HashMap<>();
        for (int number : a) map.put(number, map.getOrDefault(number, 0) + 1);

        return map.entrySet().stream().filter(number -> number.getValue() == 1).findFirst().get().getKey();
    }
}