package abstractclass;
import java.io.*;
import java.nio.charset.StandardCharsets;


public class AbstractDemo {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("E://JavaPrograms//doc.text");
            String s="Hello world!";
            byte[] b =s.getBytes();
            fout.write(b);
            fout.close();

        }catch(Exception e){
            System.out.println(e);
        }


    }
}
