package com.Exercise;

import java.util.HashMap;

/*Problem: Count the occurrences of each character in a string.
example:
str_to_count = "hello"
Output: {'h': 1, 'e': 1, 'l': 2, 'o': 1}*/
public class OccuranceCount {
    public static void occurences(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        //   char[] word=str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {

                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);
            }

        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        String str="hello";
        occurences(str);

    }
}
