package com.villo;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
    }

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here

        String lowerCase = s.toLowerCase();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < lowerCase.length(); i++)
            if (Character.isAlphabetic(lowerCase.charAt(i))) set.add(lowerCase.charAt(i));

        if (set.size() == 26) return "pangram";
        return "not pangram";
    }
}