package Multithreading;
//Extending Thread class
//Priority of threads
public class ThreadDemo extends Thread {
    public void run()
    {
        System.out.println("Thread running....");
        System.out.println("Name:"+Thread.currentThread().getName());
        System.out.println(""+Thread.currentThread().getPriority());

        //System.out.println();
    }

    public static void main(String[] args) {
        ThreadDemo t1 =new ThreadDemo();
        ThreadDemo t2 =new ThreadDemo();
     //   t1.run();
        t2.start();
        //t1.start();
        t1.start();
        System.out.println(t1.getState());
        System.out.println("First thread priority:"+t1.getPriority());
        System.out.println("Second thread priority:"+t2.getPriority());
    }
}
