package com.vivek.hackerrank;


public class JumpingOnTheClouds {

    public JumpingOnTheClouds() {
        int[] c = {0, 0, 1, 0, 0, 0, 0, 1, 0, 0};
        int jumpCount = 0;
        int cLen = c.length;
        int i = 0;
        while (i < cLen - 1) {
            for(int j = i + 2; j > 0; j--)
            {
                if(j < cLen && c[j] == 0 ) {
                    jumpCount++;
                    i = j;
                    break;
                }
            }
        }

        System.out.println("\n" + jumpCount);
    }

    public static void main(String[] args) {
        System.out.println(new JumpingOnTheClouds());
    }


}
