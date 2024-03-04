package com.villo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1)));
    }

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here

        Collections.sort(a);
        int cont = 0;
        int min = a.get(0);
        int maxLength = 0;

        for (Integer number : a) {
            if (number - min > 1) {
                cont = 1;
                min = number;
            } else
                cont++;

            if (cont > maxLength) maxLength = cont;
        }

        return maxLength;
    }
}