package com.vivek.regex;

public class ReplaceDuplicateWord {

    public static void main(String args[]) {
        final String regex = "\\b(\\w+)\\b\\s*(?=.*\\b\\1\\b)";
        final String input = "Goodbye wolf bye bye wolf world world world\n";

        final String result = input.replaceAll(regex, "");

        System.out.println(result);
    }

}
