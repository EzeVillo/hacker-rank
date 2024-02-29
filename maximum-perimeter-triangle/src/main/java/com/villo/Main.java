package com.villo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(maximumPerimeterTriangle(Arrays.asList(1, 1, 1, 3, 3)));
    }

    /*
     * Complete the 'maximumPerimeterTriangle' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY sticks as parameter.
     */

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Write your code here

        sticks.sort(Collections.reverseOrder());
        for (int i = 0; i <= sticks.size() - 3; i++) {
            int a = sticks.get(i);
            int b = sticks.get(i + 1);
            int c = sticks.get(i + 2);
            if (a < b + c)
                return Arrays.asList(c, b, a);
        }

        return Collections.singletonList(-1);
    }
}