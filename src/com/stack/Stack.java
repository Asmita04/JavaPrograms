package com.stack;

import java.util.Scanner;
public class Stack {
     public  int top=-1;
     public static  int size;

    public  void Push(int data, int[] stack){
        if(IsFull())
        {
            System.out.println("Overflow!");
        }
        else{
            top++;
            stack[top]=data;
        }
    }
    public  int Pop(int[] stack){
        if(IsEmpty()){
            System.out.println("UnderFlow!");
        }
        else{

            System.out.println("Poped!");
        }
        return stack[top--];
    }

    public  Boolean IsEmpty(){
        if(top==-1)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public   Boolean IsFull(){
        if(top==size-1)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int choice;

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the stack:");
        size =  scan.nextInt();
        int[] stack=new int[size];

        Stack obj = new Stack();

        do{
            System.out.println("1.Push"+"\n"+"2.Pop\n3.IsEmpty\n4.IsFull\n5.Display\n6.Exit");
            System.out.println("Enter your choice:");
            choice= scan.nextInt();
             switch(choice){
                 case 1:{
                     System.out.println("Enter element you wanted to push into stack:");
                     int data=scan.nextInt();
                     obj. Push(data,stack);
                     break;

                 }
                 case 2:{
                           obj. Pop(stack);
                           break;

                 }
                 case 3:{
                     if(obj.IsEmpty())
                     {
                         System.out.println("Stack is Empty");
                     }
                     else{
                         System.out.println("Stack is not Empty");
                     }
                     break;

                 }
                 case 4:{
                     if(obj.IsFull()){
                         System.out.println("Stack is Full");
                     }
                     else{
                         System.out.println("Stack is not Full");
                     }
                     break;
                 }
                 case 5:{


                     break;
                 }





             }

        }while(choice!=6);
    }



}
