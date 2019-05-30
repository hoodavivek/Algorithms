package com.vivek.codesignal;

public class SameDigitNumber {

    public SameDigitNumber(){
        System.out.println(sameDigitNumber(10000000));
    }

    boolean sameDigitNumber(int n) {
        int r = n % 10;
        n = n / 10;
        while(n != 0) {
            int c = n % 10;
            System.out.println(r + ":" + c);
            if(r != c) {
                return false;
            }
            r = c;
            n = n / 10;
        }
        return true;
    }

    boolean sameDigitNumber_01(int n) {
        return true;
    }

    public static void main(String[] args) {
        new SameDigitNumber();
    }


}
