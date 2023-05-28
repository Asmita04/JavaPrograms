package com.collectionFramework.ltd;
import java.util.*;

import java.util.Scanner;
 class user {

     public String UserName;
     public String DOB;
     public long MobileNo;
     public int RegistrationNo;
     public String AccountNo;
     public int Balance;

    public user(){}
     public user(String AccountNo, String UserName, String DOB, long MobileNo, int RegistrationNo ,int Balance) {
         this.UserName = UserName;
         this.DOB = DOB;
         this.MobileNo = MobileNo;
         this.RegistrationNo = RegistrationNo;
         this.AccountNo = AccountNo;
         this.Balance = Balance;

     }
 }
 public class Bank_Menu{



    public static void main(String[] args) {

        int Choice;
        String UserName ;
        String DOB;
        long MobileNo;
        int RegistrationNo;
        String AccountNo;
        int Balance;
        System.out.println("Welcome to MHETRE's Bank Pvt Ltd!!");
        Scanner scan = new Scanner(System.in);
        user account = new user();
        HashMap<String,user> map= new HashMap<String, user>();
     //   Iterator<user> it = obj.iterator();

        do {
            System.out.println("1.Register User");
            System.out.println("2.Remove Account");
            System.out.println("3.Transfer Money");
            System.out.println("4.Display List of All Accounts");
            System.out.println("5.Exit");
            System.out.println("Enter Your Choice:");
            Choice = scan.nextInt();

            switch (Choice) {
                case 1: {


                    System.out.println("Enter name:");
                    scan.nextLine();
                    UserName = scan.nextLine();


                    System.out.println("Enter DOB:");
                    DOB = scan.nextLine();

                    System.out.println("Enter Mobile:");
                    MobileNo = scan.nextLong();

                    System.out.println("Enter Account:");
                    scan.nextLine();
                    AccountNo = scan.nextLine();

                    System.out.println("Enter Registration No:");
                    RegistrationNo = scan.nextInt();

                    System.out.println("Enter Balance:");
                    Balance = scan.nextInt();

                    account = new user(AccountNo,UserName,DOB,MobileNo,RegistrationNo,Balance);
                    map.put(AccountNo, account);
                    break;

                }

                case 2: {

                   System.out.println("Enter Account number to remove from list");
                   scan.nextLine();
                   AccountNo=scan.nextLine();
                   if(map.containsKey(AccountNo))
                   {
                        map.remove(AccountNo);
                       System.out.println("1 Account Deleted!");
                   }
                   else
                   {
                       System.out.println("Account is not present!");
                   }


                     break;

                }
                case 3: {

                }
                case 4: {
                    System.out.println("Account No: \t\t"+"User Name: \t\t" + "DOB\t\t"+"Mobile No:\t\t"+"Registration No\t"+"Balance\t\n");
                    for(Map.Entry<String, user> entry:map.entrySet()){
                        user account1=entry.getValue();
                        System.out.println(account1.AccountNo+"\t"+account1.UserName+"\t  "+account1.DOB+"\t "+account1.MobileNo+"\t"+account1.RegistrationNo+"\t"+account1.Balance+"\t\n");
                    }

                    break;

                }
                case 5: {

                    System.out.println("Exit!");
                    break;
                }
                default:
                    throw new IllegalStateException("Unexpected value: " + Choice);
            }


        } while (Choice != 5);
    }
}
