package multithreading;


class Test{
     static  public void printTable(int num){
         for(int i=1;i<10;i++)
         {
             System.out.println(num*i);
         }try{
             Thread.sleep(600);
         }catch (Exception e){
             System.out.println(e);
         }
    }

}

class Thread5 extends Thread {
    public void run(){
        Test.printTable(1);
    }
}
class Thread6 extends Thread {
    public void run(){
        Test.printTable(3);
    }
}


class Thread3 extends Thread {
    public void run(){
        Test.printTable(500);
    }
}



class Thread4 extends Thread {
    public void run(){
        Test.printTable(10);
    }
}





public class StaticSyncronization {

    public static void main(String[] args) {
        Test obj = new Test();
        Thread5 t1= new Thread5();
        Thread6 t2= new Thread6();
        Thread3 t3= new Thread3();
        Thread4 t4= new Thread4();


    t1.start();
    t2.start();
    t3.start();
    t4.start();



    }
}
