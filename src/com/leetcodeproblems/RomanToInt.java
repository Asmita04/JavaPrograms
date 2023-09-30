package com.leetcodeproblems;

import java.util.Scanner;

public class RomanToInt {
    private static int romanCharToInt(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // Return 0 for any invalid characters
        }
    }

    public int romanToInt(String s) {
        char[] arr = s.toCharArray();
        int sum = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            int value = romanCharToInt(arr[i]);

            if (i > 0 && romanCharToInt(arr[i - 1]) < romanCharToInt(arr[i])) {
                value -= romanCharToInt(arr[i - 1]);
                i--; // Move the index back to skip the previous character since we have already processed it.
            }

            sum += value;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Roman number:");
        String s = scan.next();
        RomanToInt rm = new RomanToInt();
        int sum = rm.romanToInt(s);
        System.out.println("Sum is: " + sum);
    }
}
