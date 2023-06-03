package com.filehandling;

import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) throws Exception{
        FileWriter fw=new FileWriter("E:\\JavaPrograms\\src\\com\\filehandling\\Text.txt");
        String str="This is java program";
        fw.write(str);
        System.out.println("Sucess!");
        fw.close();



    }
}
