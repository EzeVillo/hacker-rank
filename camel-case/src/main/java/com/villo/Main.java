package com.villo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(camelCase(line));
        }
    }

    public static StringBuilder camelCase(String input) {
        String[] inputArray = input.split(";");
        String[] splittedWords;
        StringBuilder result = new StringBuilder();
        final String SPLIT = "S";
        final String CLASS = "C";
        final String METHOD = "M";
        final String WHITE_SPACE = " ";
        final String PARENTHESIS = "()";

        if (inputArray[0].equalsIgnoreCase(SPLIT)) {
            splittedWords = inputArray[2].split("(?=[A-Z])");

            for (int i = 0; i < splittedWords.length; i++) {
                result.append(splittedWords[i].toLowerCase());
                if (i != splittedWords.length - 1) {
                    result.append(WHITE_SPACE);
                }
            }

            if (inputArray[1].equalsIgnoreCase(METHOD)) {
                result.delete(result.length() - 2, result.length());
            }
        } else {
            splittedWords = inputArray[2].split(WHITE_SPACE);

            for (int i = 0; i < splittedWords.length; i++) {
                if (i == 0 && !inputArray[1].equalsIgnoreCase(CLASS)) {
                    result.append(splittedWords[i]);
                } else {
                    result.append(splittedWords[i].substring(0, 1).toUpperCase()).append(splittedWords[i].substring(1));
                }
            }

            if (inputArray[1].equalsIgnoreCase(METHOD)) {
                result.append(PARENTHESIS);
            }
        }

        return result;
    }
}