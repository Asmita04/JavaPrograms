package com.Exercise;

import java.util.*;

public class StringReverse {
    static void swap(char a , char b){
        char temp;
        temp=b;
        b=a;
        a=temp;

    }




    public static void main(String[] args) {
        String str= "Asmita";
        char[] array=str.toCharArray();
        List<Character>  list=new ArrayList<>();

        for(char X:array){
            list.add(X);
        }
        Collections.reverse(list);

        System.out.println(list);

        Iterator<Character> it= list.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }

    }
}
