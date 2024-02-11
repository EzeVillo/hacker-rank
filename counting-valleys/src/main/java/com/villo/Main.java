package com.villo;

public class Main {
    public static void main(String[] args) {
        System.out.println(countingValleys(12, "DDUUDDUDUUUD"));
    }

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here

        int altitude = 0;
        int valleys = 0;

        for (int i = 0; i < path.length(); i++)
            if (path.charAt(i) == 'U') {
                altitude++;
                if (altitude == 0) valleys++;
            } else {
                altitude--;
            }

        return valleys;
    }
}