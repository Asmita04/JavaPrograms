package com.Exercise;
import java.util.Scanner;

public class NumberSystem {

    static int reminder;
    static int i=1;
    static  int DecimalToOctal(int Binary_num)
    {
        int Octal_num=0;
        int Decimal_num=BinaryToDecimal(Binary_num);
        System.out.println("Decimal in function of octal conversion:"+Decimal_num);
        int i=1;
        while(Decimal_num!=0)
        {
        reminder= Decimal_num%8;
        Octal_num= Octal_num +reminder*i;
        i=i*10;
        Decimal_num= Decimal_num/8;
        }
        return Octal_num;
    }

    static  int BinaryToDecimal(int Binary_num)
    {


        int Decimal=0;
        while(Binary_num!=0)
        {
            reminder=Binary_num%10;
            Decimal = Decimal + (reminder * i);
            Binary_num = Binary_num /10;
            i= i*2;
        }
        return Decimal;
    }
    public static void main(String[] args){
        int Binary_num ;
        Scanner Scan=new Scanner(System.in);

        Binary_num= Scan.nextInt();
        System.out.println("Enter binary num:"+ Binary_num);


     //   System.out.println("Decimal is:"+BinaryToDecimal(Binary_num));

        System.out.println("Octal num:"+DecimalToOctal(Binary_num));

    }
}
