package com.vivek.codesignal;

/**
 Given a permutation, produce its inverse permutation.

 Example

 For permutation = [1, 3, 4, 2], the output should be
 inversePermutation(permutation) = [1, 4, 2, 3].
 */

public class InversePermutation {

    public InversePermutation() {
        int[] permutation = {1, 3, 4, 2};
        permutation = inversePermutation(permutation);
        int l = permutation.length, i = 0;
        while (i < l) {
            System.out.println(permutation[i]);
            i++;
        }
    }

    int[] inversePermutation_1(int[] permutation) {
        int l = permutation.length, i = 0;
        int[] copy = new int[l];

        while (i < l)
        {
           copy[i] = permutation[i];
           i++;
        }

        i = 1;
        while (i <= l)
        {
            int k = copy[i - 1];
            permutation[k - 1] = i;
            i++;
        }
        return permutation;
    }

    int[] inversePermutation(int[] p) {
        int l = p.length, i = 0;
        int[] c = new int[l];

        while (i < l)
        {
            c[i] = p[i];
            i++;
        }

        i = 0;
        while (i < l)
        {
            p[c[i] - 1] = ++i;
        }
        return p;
    }

    public static void main(String[] args) {
        new InversePermutation();
    }

}
