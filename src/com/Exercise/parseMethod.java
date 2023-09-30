package com.Exercise;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class parseMethod {
    Scanner scan;
    public Integer readInt(){
        return Integer.parseInt(scan.nextLine());
    }
    public static void main(String[] args){

        parseMethod obj=new parseMethod();
        String str="9";
        int X=Integer.parseInt(str);
        System.out.println(X);
        int choice;
        choice=obj.readInt();

    }
}
