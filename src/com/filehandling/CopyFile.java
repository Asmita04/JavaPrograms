package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
    public static void main(String[] args) throws Exception {
        FileInputStream fout=new FileInputStream("E:\\JavaPrograms\\src\\com\\filehandling\\Source1.txt");
        String str="THIS IS SOURCE PAGE 1!";
        byte[] b=str.getBytes();
        fout.read(b);
        System.out.println("Sucessfully written!");

        fout.close();
        FileOutputStream fout2 = new FileOutputStream("E:\\JavaPrograms\\src\\com\\filehandling\\Source2.txt");
        String  str2=str.toLowerCase();

        byte[] b1=str2.getBytes();
        fout2.write(b1);
        fout2.close();
    }
}
