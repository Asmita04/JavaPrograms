package com.collectionFramework.ltd;

import java.util.ArrayList;
import java.util.Iterator;

//ArrayLists are non- syncronized
public class SyncronizedArrayList {

   static ArrayList<Integer> list=new ArrayList<Integer>();
    public static void main(String[] args) {
        ThreadDemo t1= new ThreadDemo();
        t1.start();
        ThreadDemo2 t2= new ThreadDemo2();
        t2.start();
        for(int i=0;i<10;i++){
            list.add(i);
        }
    }
}
class ThreadDemo extends Thread{
    @Override
    public void run() {
        Iterator<Integer> it = SyncronizedArrayList.list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class ThreadDemo2 extends Thread{
    @Override
    public void run() {
        Iterator<Integer> it = SyncronizedArrayList.list.iterator();
        while(it.hasNext()){
            System.out.println("Thread2+"+it.next());
        }
    }
}

