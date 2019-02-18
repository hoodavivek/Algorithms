package com.vivek.codesignal;

import java.util.HashSet;
import java.util.Set;

/**
 Given integers n, l and r, find the number of ways to
 represent n as a sum of two integers A and B such that l ≤ A ≤ B ≤ r.

 Example

 For n = 6, l = 2, and r = 4, the output should be
 countSumOfTwoRepresentations(n, l, r) = 2.
 These ways are: 2 + 4 = 6 and 3 + 3 = 6.
 */

public class CountSumOfTwoRepresentations {

    public CountSumOfTwoRepresentations() {
        System.out.println(countSumOfTwoRepresentations(6, 2, 4));
        System.out.println(countSumOfTwoRepresentations(6, 3, 3));
        System.out.println(countSumOfTwoRepresentations(10, 9, 11));
    }

    int countSumOfTwoRepresentations(int n, int l, int r) {
        int result = 0;
        int i = l;
        Set<Integer> set = new HashSet<Integer>();
        while(i <= r) {
            int v = n - i;
            if(v >= l && v <= r && !set.contains(v)) {
                System.out.println(i + " : " + v);
                result++;
                set.add(i);
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        new CountSumOfTwoRepresentations();
    }
}
