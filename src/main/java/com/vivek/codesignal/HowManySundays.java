package com.vivek.codesignal;

import java.util.*;

/**
 We need a function that calculates the number of Sundays after a specific day for a given period.

 Example

 For n = 9 and startDay = "Saturday", the output should be
 howManySundays(n, startDay) = 2;
 For n = 7 and startDay = "Sunday", the output should be
 howManySundays(n, startDay) = 1.

 */

public class HowManySundays {


    public HowManySundays() {
        System.out.println(howManySundays_01(3, "Wednesday"));
        System.out.println(howManySundays_02(3, "Wednesday"));
        System.out.println(howManySundays_03(3, "Wednesday"));
    }

    int howManySundays_01(int n, String startDay) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Sunday", 1);
        map.put("Monday", 2);
        map.put("Tuesday", 3);
        map.put("Wednesday", 4);
        map.put("Thursday", 5);
        map.put("Friday", 6);
        map.put("Saturday", 7);

        int day = map.get(startDay).intValue() + 1;
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (day > 7) {
                day = 1;
            }

            if (day == 1) {
                result++;
            }

            day++;
        }

        return result;
    }

    int howManySundays_02(int n, String s) {
        s = s.substring(0, 2);
        List<String> m = Arrays.asList("Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");
        int d = m.indexOf(s) + 2, r = 0, i = 1;
        while (i <= n) {
            if (d > 7) {
                d = 1;
            }
            if (d == 1) {
                r++;
            }
            d++;
            i++;
        }
        return r;
    }

    int howManySundays_03(int n, String s) {
        return n / 7 + (n % 7 + "SuMoTuWeThFrSa".indexOf(s.substring(0, 2)) / 2) / 7;
    }

    public static void main(String[] args) {
        new HowManySundays();
    }

}