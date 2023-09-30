package com.leetcodeproblems.codewars;

public class LengthOfLastString {
    public  int lengthOfLastWord(String s) {
         s = s.trim();

        String[] str=s.split("\\s");

        return str[str.length-1].length();

    }

    public static void main(String[] args) {

        String str="Asmita Mhetre";
        String str1="   fly me   to   the moon  ";
        LengthOfLastString obj=new LengthOfLastString();

        System.out.println("After calling func length: "+obj.lengthOfLastWord(str));
        System.out.println("After str1 calling func length: "+obj.lengthOfLastWord(str1));

    }
}
