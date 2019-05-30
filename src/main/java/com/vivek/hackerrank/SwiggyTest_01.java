package com.vivek.hackerrank;


import java.util.*;

public class SwiggyTest_01 {

    // Complete the braces function below.
    static String[] braces(String[] values) {

        int l = values.length;

        String[] returns = new String[values.length];

        for(int i = 0; i < l ; i++) {
            String value = values[i];
            if(value.length() % 2 != 0) {
                returns[i] = "NO";
            } else {
                returns[i] = checkBraces(value);
            }
        }

        return returns;
    }

    public static int maxStreak(int m, List<String> data) {
        // Write your code here
        int totalPresent = 0;
        int returnMaxResult = 0;
        if(data.size() <= 1) {
            return 0;
        }

        for(String d : data) {
            boolean isAllPresent = true;
            for(int i = 0; i < d.length(); i++)
            {
                if(d.charAt(i) != 'Y') {
                    isAllPresent = false;
                    break;
                }
            }

            if(isAllPresent) {
                totalPresent++;
            } else {
                if(returnMaxResult < totalPresent) {
                    returnMaxResult = totalPresent;
                }
                totalPresent = 0;
            }
        }

        return returnMaxResult;
    }

    private static String checkBraces(String value) {
        Stack<Character> expression = new Stack<Character>();
        int l = value.length();
        for(int i = 0; i <  l; i++)
        {
            char ch = value.charAt(i);

            if(ch == '(' || ch == '{' ||  ch == '[')
                expression.push(ch);
            else if(!expression.isEmpty()) {
                char pop = expression.pop();
                if ((ch == ')' && pop == '(')
                    || (ch == '}' && pop == '{')
                    || (ch == ']' && pop == '[')) {
                    continue;
                }
                else
                    return "NO";
            }
            else {
                return "NO";
            }
        }

        if(!expression.empty())
            return "NO";
        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("YYYY");
        list.add("YYNY");
        list.add("YYNY");
        list.add("YYYY");


        System.out.println(maxStreak(5, list));
/*
        int valuesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] values = new String[valuesCount];

        for (int i = 0; i < valuesCount; i++) {
            String valuesItem = scanner.nextLine();
            values[i] = valuesItem;
        }

        String[] res = braces(values);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);

            if (i != res.length - 1) {
                System.out.println("\n");
            }
        }

        scanner.close(); */
    }
}