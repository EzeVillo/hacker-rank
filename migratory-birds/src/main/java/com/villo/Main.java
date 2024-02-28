package com.villo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(migratoryBirds(Arrays.asList(1, 4, 4, 4, 5, 3, 1, 1)));
    }

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr)
            map.put(i, map.getOrDefault(i, 0) + 1);

        return map.entrySet().stream()
                .min(Map.Entry.<Integer, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry::getKey)).get().getKey();
    }
}