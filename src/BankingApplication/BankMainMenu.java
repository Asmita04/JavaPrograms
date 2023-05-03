package BankingApplication;


import JavaCollections.LinkedListDemo1;

import java.sql.SQLOutput;
import java.util.Scanner;
public class BankMainMenu {



    static class Node {

    public String UserName;
    public String DOB;
    public long MobileNo;
    public long RegistrationNo;
    public long AccountNo;
    public int Balance;
    Node next;

    public Node(String UserName,String DOB,long MobileNo,long RegistrationNo,long AccountNo,int Balance) {
            this. UserName = UserName;
            this. DOB = DOB;
            this. MobileNo = MobileNo;
            this. RegistrationNo = RegistrationNo;
            this. AccountNo = AccountNo;
            this. Balance = Balance;
            this.next=null;
        }


    }
    public Node head = null;
    public void addFirst(String UserName,String DOB,long MobileNo,long RegistrationNo,long AccountNo,int Balance)
    {
        BankMainMenu.Node newNode= new Node(UserName, DOB, MobileNo, RegistrationNo, AccountNo, Balance);
        if(head == null)
        {

            head =newNode;
            return;
        }
        newNode.UserName=UserName;
        newNode.RegistrationNo=RegistrationNo;
        newNode.AccountNo=AccountNo;
        newNode.Balance=Balance;
        newNode.next= head;
        head = newNode;
    }
    public void display() {
        BankMainMenu.Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("User name\t\t"+"DOB\t\t"+"Mobile No \t\t" + "Account No\t\t"+"Registration No\t\t"+"Balance\t\t");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.UserName+ "    "+current.DOB+"      "+current.MobileNo+"    "+current.AccountNo+"       "+current.RegistrationNo+"      "+current.Balance+"\t\n");
            current = current.next;
        }
        System.out.println("\n\n");
    }
    void deleteNode(long AccountNo)
    {
        // Store head node
        BankMainMenu.Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.AccountNo == AccountNo) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.AccountNo != AccountNo) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)

            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }



    public static void main(String[] args) {

        int Choice;
        String UserName ;
        String DOB;
        long MobileNo;
        long RegistrationNo;
        long AccountNo;
        int Balance;
        System.out.println("Welcome to MHETRE's Bank Pvt Ltd!!");
        Scanner scan = new Scanner(System.in);

        BankMainMenu menu =new BankMainMenu();

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

               //   BankMainMenu. Node obj = new  BankMainMenu().Node( );
                    // = Node("Asmita","4/1/1",587496,568989,748545,963852741);

                        System.out.println("Enter name:");
                         scan.nextLine();
                        UserName = scan.nextLine();


                        System.out.println("Enter DOB:");
                        DOB = scan.nextLine();

                        System.out.println("Enter Mobile:");
                        MobileNo = scan.nextLong();

                        System.out.println("Enter Account:");
                        AccountNo = scan.nextLong();

                        System.out.println("Enter Registration No:");
                        RegistrationNo = scan.nextLong();

                        System.out.println("Enter Balance:");
                        Balance = scan.nextInt();

                        menu.addFirst(UserName, DOB, MobileNo, RegistrationNo, AccountNo, Balance);
                    }

                         break;
                case 2: {

                        System.out.println("Enter Account number to remove from list");
                        AccountNo=scan.nextLong();

                        menu.deleteNode(AccountNo);

                }
                case 3: {

                }
                case 4: {
                    menu.display();

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
