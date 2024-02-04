package com.villo;

public class Main {
    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
    }

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here

        final String AM = "AM";

        if (s.endsWith(AM))
            if (s.startsWith("12")) {
                return "00" + s.substring(2, 8);
            } else {
                return s.substring(0, 8);
            }

        if (s.startsWith("12")) {
            return s.substring(0, 8);
        }

        return 12 + Integer.valueOf(s.substring(0, 2)) + s.substring(2, 8);
    }
}