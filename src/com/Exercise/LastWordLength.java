package com.Exercise;
public class LastWordLength {

    public static int lengthOfLastWord(String s) {
        // Trim trailing spaces
        s = s.trim();
        System.out.println("After trim:"+s);
        // Split the string into words
        String[] words = s.split("\\s");

        // Traverse the words from the end and find the last word that consists of only alphabets
        return words[words.length - 1].length();

        // If no alphabetic word is found, return 0
    }

    public static void main(String[] args) {
        String inputString = "                     ";
        System.out.println("Given String is:"+inputString);
        int result = lengthOfLastWord(inputString);
        System.out.println(result);  // Output: 5 (length of the word "World")

    }
}
