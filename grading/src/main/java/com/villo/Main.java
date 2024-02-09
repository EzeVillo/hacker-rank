package com.villo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(gradingStudents(Arrays.asList(84, 29, 57)));
    }

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        return grades.stream().map(grade -> {
            int remainder = grade % 5;
            if (remainder > 2 && grade >= 38)
                return grade + 5 - remainder;

            return grade;
        }).collect(Collectors.toList());
    }
}