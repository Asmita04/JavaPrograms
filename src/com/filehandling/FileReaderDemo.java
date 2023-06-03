package com.filehandling;

import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) throws  Exception{
        FileReader fr= new FileReader("E:\\JavaPrograms\\src\\com\\filehandling\\Text.txt");



     /*   if((fr.read()!)=-1)
        {
            System.out.println(i);
        }*/
        fr.close();
    }
}
