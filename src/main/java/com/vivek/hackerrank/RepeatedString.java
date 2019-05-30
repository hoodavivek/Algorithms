package com.vivek.hackerrank;

public class RepeatedString {

    public RepeatedString() {
        String s = "abc";
        int n = 10;
        long result = repeatedString(s, n);
        System.out.println(result);
    }

    static long repeatedString(String s, long n) {
        long result =  n / s.length() * countCharacter(s, 'a');
        long mod = n % s.length();
        if(mod != 0) {
            result += countCharacter(s.substring(0, (int) mod), 'a');
        }
        return result;
    }

    static int countCharacter(String s, Character character) {
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == character) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new RepeatedString());
    }}
