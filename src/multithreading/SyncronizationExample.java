package multithreading;


class Table{

    void printTable(int num) {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num * i);
            }
            try{
                Thread.sleep(400);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
/*
class Thread1 extends Thread{
    Table t;
    Thread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }



}
class Thread2 extends Thread {
    Table t;
    Thread2(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(3);
    }

}
public class SyncronizationExample  {
    public static void main(String[] args) {

        Table t = new Table();
        Thread1 t1=new Thread1(t);
        Thread2 t2=new Thread2(t);

        t1.start();
        t2.start();

    }
}
*/