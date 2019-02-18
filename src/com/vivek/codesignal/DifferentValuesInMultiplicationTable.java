package com.vivek.codesignal;

import java.util.HashSet;
import java.util.Set;

/**
 Define a multiplication table of size n by m as follows: such table consists of n rows and m columns.
 Cell on the intersection of the ith row and the jth column (i, j > 0) contains the value of i * j.

 Given integers n and m, find the number of different values that are found in the table.

 Example

 For n = 3 and m = 2, the output should be
 differentValuesInMultiplicationTable(n, m) = 5.
 */

public class DifferentValuesInMultiplicationTable {

    public DifferentValuesInMultiplicationTable(){
        System.out.println(differentValuesInMultiplicationTable(4, 5));
    }

    int differentValuesInMultiplicationTable(int n, int m) {
        Set<Integer> set = new HashSet<Integer>();

        for(int i = 1; i <= n ; i++) {
            for(int j = 1; j <= n ; j++) {
                int value = i * j;
                if(!set.contains(value)) {
                    set.add(value);
                }
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        new DifferentValuesInMultiplicationTable();
    }

}
