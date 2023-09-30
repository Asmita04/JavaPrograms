package com.leetcodeproblems;

public class ScrambleString {
    public static void scramble(String str1, String str2) {
        char[] word= str1.toCharArray();
        for(int i=str1.length()-1;i>0;i++)
            System.out.println(word[i]);
      //  return false;
    }


    public static void main(String[] args) {
        scramble("Asmita","Mhetre");
    }
}
