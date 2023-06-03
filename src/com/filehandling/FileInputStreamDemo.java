package com.filehandling;

import java.io.FileInputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("E:\\JavaPrograms\\src\\com\\filehandling\\Text.txt");
//           int i =fin.read();
//            System.out.println(i);
//            System.out.println((char)i);


           byte[] b= new byte[fin.available()];

           fin.read(b);
           String str=new String(b);
            System.out.println(str);
            /*for(int x:b)
            {
                System.out.println(x);
            }*/
           /* int i=0;
            while((i=fin.read())!=-1)
            {
                System.out.print((char)i);
            }*/
            fin.close();

        }catch(Exception e){
            System.out.println(e);
        }

    }
}
