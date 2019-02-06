package com.vivek.geeksforgeeks;

import java.util.Scanner;

public class BasicArrayMissingNumber {
    public static void main(String[] args) {
        System.out.println("Enter number of Test Case");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("Test Case : " + (t + 1));
            System.out.println("Enter size of Array");
            int n = sc.nextInt();
            int totalArray = 0;
            int totalValue = 0;
            int i;
            for (i = 1; i < n; i++) {
                totalArray += i;
                int val = sc.nextInt();
                totalValue += val;
            }
            totalArray += i;
            System.out.println(totalArray - totalValue);
        }
    }
}
