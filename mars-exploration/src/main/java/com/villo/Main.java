package com.villo;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(marsExploration("SOSOOSOSOSOSOSSOSOSOSOSOSOS"));
    }

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
        // Write your code here

        final char[] SOS = "SOS".toCharArray();

        return (int) IntStream.range(0, s.length())
                .filter(character -> SOS[character % 3] != s.charAt(character))
                .count();
    }
}