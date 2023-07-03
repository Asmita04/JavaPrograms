package multithreading;
class MyThread extends Thread{
    public MyThread(String Name)
    {
        super(Name);
        //void setDaemon(boolean );
      //  setPriority(Thread.MAX_PRIORITY);
      //  setPriority(Thread.MIN_PRIORITY);    //1
    //    setPriority(Thread.NORM_PRIORITY);
    }
}
public class ThreadMethods {
    public static void main(String[] args) {

    MyThread obj= new MyThread("Hello There!");
        obj.start();
        System.out.println("State: "+obj.getState());
        System.out.println("Priority:"+obj.getPriority());
        System.out.println("Alive: "+obj.isAlive());
        System.out.println("Daemon: "+obj.isDaemon());
        System.out.println("Is interrupted: "+obj.isInterrupted());

        obj.stop();
        System.out.println("State: "+obj.getState());
       // System.out.println("ID: "+obj.threadId());
        int count =obj.activeCount();
        System.out.println(" Active running threads:"+count);


    }
}
