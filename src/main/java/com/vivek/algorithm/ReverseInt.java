package com.vivek.algorithm;

public class ReverseInt {

    public ReverseInt(int a) {
        long startTime = System.nanoTime();

        long reversedNum = 0;
        long input_long = a;

        while (input_long != 0) {
            reversedNum = reversedNum * 10 + input_long % 10;
            input_long = input_long / 10;
        }

        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }

        long endTime = System.nanoTime();
        //divide by 1000000 to get milliseconds.
        long duration = (endTime - startTime);

        System.out.println(reversedNum + " " + duration);
    }


    public static void main(String args[]) {
        new ReverseInt(-124);
    }
}
