package com.vivek.codesignal;


public class AreIsomorphic  {

    public AreIsomorphic() {
        int a[][] = {{1,1,1},{0,0}};
        int b[][] = {{2,1,1}, {2,1}};

        areIsomorphic(a, b);
    }

    boolean areIsomorphic(int[][] array1, int[][] array2) {
        if(array1.length != array2.length) {
            return false;
        }

        for(int i = 0 ; i < array1.length; i++) {
            if(array1[i].length != array2[i].length) {
                return false;
            }
        }

        Boolean bool = Boolean.valueOf(null);

        System.out.println(bool.booleanValue());

        return true;
    }

    public static void main(String args[]) {
        new AreIsomorphic();
    }

}
