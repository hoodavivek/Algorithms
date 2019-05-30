package com.vivek.codesignal;

/**

 Define GCPD (Greatest Common Prime Divisor) as the largest
 prime number that divides both given positive integers.
 Your task is to find GCPD of the given integers a and b.

 Example

 For a = 12 and b = 18, the output should be
 greatestCommonPrimeDivisor(a, b) = 3;
 For a = 12 and b = 13, the output should be
 greatestCommonPrimeDivisor(a, b) = -1.

 */

public class GCPrimeDivisor {

    public GCPrimeDivisor() {
        System.out.println(isPrime(3)+ "" + greatestCommonPrimeDivisor(12, 18));
    }

    int greatestCommonPrimeDivisor(int a, int b) {
        int g = -1, i = 3;
        while(isPrime(i) && i < a && i < b) {
            if(a % i == 0 && b % i == 0)
                g = i;
            i++;
        }
        return g;
    }

    boolean isPrime(int M) {
        for(int i = 2; i <= M/2; i++)
            if(M % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        new GCPrimeDivisor();
    }

}


