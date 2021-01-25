package com.home_Work_Lesson_6_EX4.palindrome;

public class Palindrome {

    public static boolean isNumberPalindrome(long a){
        boolean isNumberPalindrome = false;

        String text = a + "";                               // change number to string
        char[] chars = text.toCharArray();                  // transform string to char array

        for (int i = 0; i < chars.length; i++) {            // comparison of equidistant elements
            if (chars[i] == chars[chars.length - 1 - i]){
                isNumberPalindrome = true;
            } else {
                isNumberPalindrome = false;
                break;
            }
        }

        System.out.println(isNumberPalindrome);
        return isNumberPalindrome;
    }
}
