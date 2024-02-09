package com.villo;

public class Main {
    public static void main(String[] args) {
        System.out.println(flippingBits(9));
    }

    /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long n) {
        // Write your code here

        return Integer.toUnsignedLong(~(int) n);
    }
}