package com.leetcodeproblems.codewars;

import java.util.Arrays;

/*Complete the solution so that the function will break up camel casing, using a space between words.
* Example: "camelCasing"  =>  "camel Casing"*/

public class CamelCase {

    public static String camelCase(String str) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char character= str.charAt(i);
            if(Character.isUpperCase(character)){
                if(i>0){
                 result.append(" ");
                }
                result.append(character);
            }
            else{
                result.append(character);
            }

        }


        return result.toString();
    }

    public static void main(String[] args) {
        String str="camelCasing";

        String resu=camelCase(str);
        System.out.println(resu);
    }
}
