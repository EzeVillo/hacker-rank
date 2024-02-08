package com.villo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(matchingStrings(
                Arrays.asList("abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf"),
                Arrays.asList("abcde", "sdaklfj", "asdjf", "na", "basdn")));
    }

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here

        Map<String, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (String string : strings) map.put(string, map.getOrDefault(string, 0) + 1);

        for (String query : queries) result.add(map.getOrDefault(query, 0));

        return result;
    }
}