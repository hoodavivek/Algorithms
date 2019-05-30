package com.vivek.geeksforgeeks;

import java.util.*;
import java.lang.*;

public class BasicArrayMaxAndMin {

    public static void main(String[] args) {
        System.out.println("Enter number of Test Case");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("Test Case : " + (t + 1));
            System.out.println("Enter size of Array");
            int n = sc.nextInt();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (val > max) {
                    max = val;
                }
                if (val < min) {
                    min = val;
                }
            }
            System.out.println("Max: " + max + " Min :" + min);
        }
    }
}