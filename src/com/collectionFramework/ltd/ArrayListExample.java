package com.collectionFramework.ltd;



import java.util.Arrays;
import java.util.Iterator;
import java.util.*;
//Let us check syncronization property in ArrayList

class PrintList{
    void printList(ArrayList<Integer> obj){
        Iterator it = obj.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println(e);
        }
    }


}
class Thread1 extends Thread{
    PrintList p;

    public Thread1(PrintList p) {
        this.p=p;
    }

    @Override
    public void run() {
        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.addAll(Arrays.asList(1,2,3,4,5));
        p.printList(list1);
    }
}
class Thread2 extends Thread{
    PrintList p;
    public Thread2(PrintList p) {
        this.p=p;
    }

    @Override
    public void run() {
        ArrayList<Integer> list2=new ArrayList<Integer>();
        list2.addAll(Arrays.asList(10,20,30,40,50));
        p.printList(list2);
    }
}



public class ArrayListExample {

    public static void main(String[] args) throws Exception{
        PrintList p= new PrintList();
         Thread1 t1 = new Thread1(p);
         Thread2 t2 = new Thread2(p);

        t1.start();
        t2.start();

    }
}
