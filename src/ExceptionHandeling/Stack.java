package ExceptionHandeling;
import java.util.Scanner;

public class Stack {
     static int size=5;
     static int[] Stack= new int[size];
     static int Top = -1;


    static void push(int Value) throws Exception
    {
            if (Top == size - 1)
                throw  new OverflowException();
            Top++;
            Stack[Top] = Value;
            System.out.println("Inserted!");

    }

    static void pop() throws Exception
    {
        if(Top==-1)
            throw new UnderflowException();
        Top--;
        System.out.println("Popped!");

    }
    static void StackDisplay(int[] Stack)
    {
        if(Top==-1)
        {
            System.out.println("Stack is Empty!");
        }
        else{
            for(int i=Top;i>=0;--i)
            {
                System.out.println(Stack[i]);
            }
        }


    }
    public static void main(String[] args) throws  Exception{


        try{
            push(10);
            push(5);
            push(7);
             pop();
             pop();
             pop();
             pop();
        }catch(Exception e){
            System.out.println(e);
        }







    }
}
