package com.home_Work_Lesson_6_EX4;

import com.home_Work_Lesson_6_EX4.palindrome.Palindrome;

import java.util.Scanner;

public class Launch {

    /* ЗАДАНИЕ 4
    Написать метод для проверки является ли число полиндромом.
    */



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);           // scanner opened
            System.out.println("Press a number: ");
            long x = scanner.nextInt();

            scanner.close();                                    // scanner closed

            Palindrome.isNumberPalindrome(x);

        }
    }