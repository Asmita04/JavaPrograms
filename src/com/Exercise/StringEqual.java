package com.Exercise;

public class StringEqual {

    public static void main(String[] arg) {
        String str= "Asmita";
        String str1= new String("Asmita");
        String str2="Asmita";



        System.out.println(str.equals(str1));
        if(str==str2)
        {
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }

        if(str==str1)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


    }
}
