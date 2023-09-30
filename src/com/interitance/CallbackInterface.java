package com.interitance;

interface Member{
    void callback();
}

 class Customer implements Member{
    String name;
    Customer(String name){
        this.name=name;
    }

     @Override
     public void callback() {
         System.out.println("okay , I will visit said  '  "+name);
     }
 }

 class Store{

    Member[] members=new Member[10];
    int count;
    void register(Member mem){
        members[count++]=mem;
    }

    void display(){
        for(int i=0;i<count;i++){
            members[i].callback();
        }
    }


}
public class CallbackInterface {
    public static void main(String[] args) {
        Store s=new Store();
        Customer c1=new Customer("John");
        s.register(c1);
       s.display();


    }


}
