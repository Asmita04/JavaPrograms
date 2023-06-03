package com.filehandling;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try{
            FileOutputStream fout =new FileOutputStream("E:\\JavaPrograms\\src\\com\\filehandling\\text.txt");
            fout.write(35);
            fout.close();

            System.out.println("Successfully written!");


        }catch(Exception e){
            System.out.println(e);
        }

    }
}
