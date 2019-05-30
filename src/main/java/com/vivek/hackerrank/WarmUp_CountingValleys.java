package com.vivek.hackerrank;

import java.io.*;

public class WarmUp_CountingValleys {
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int currentDepth = 0;
        int valleys = 0;
        for(int i = 0; i < n; i++){

            if(s.charAt(i) == 'D') {
                currentDepth--;
            } else {
                currentDepth++;
            }

            if(currentDepth == -1 && s.charAt(i) == 'D') {
                System.out.println(i);
                valleys++;
            }
        }
        return valleys;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }
}