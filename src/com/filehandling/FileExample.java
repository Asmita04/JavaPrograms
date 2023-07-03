package com.filehandling;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file= new File("E:\\JavaPrograms\\src\\com\\filehandling\\Text.txt");
        System.out.println(file.isFile());
        System.out.println(file.canRead());
        System.out.println(file.mkdir());
        System.out.println(file.getName()+" "+file.list());

    }
}
