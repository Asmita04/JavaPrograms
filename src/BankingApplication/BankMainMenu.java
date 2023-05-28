package bankingApplication;
import java.util.*;

import java.util.Scanner;
class User {

    public String userName;
    public String DOB;
    public long mobileNo;
    public int registrationNo;
    public String accountNo;
    public int balance;

    public User(){}
    public User(String accountNo, String userName, String DOB, long mobileNo, int registrationNo ,int balance) {
        this.userName = userName;
        this.DOB = DOB;
        this.mobileNo = mobileNo;
        this.registrationNo = registrationNo;
        this.accountNo = accountNo;
        this.balance = balance;

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", DOB='" + DOB + '\'' +
                ", mobileNo=" + mobileNo +
                ", registrationNo=" + registrationNo +
                ", accountNo='" + accountNo + '\'' +
                ", balance=" + balance +
                '}'+'\n';
    }
}
public class BankMainMenu{



    public static void main(String[] args) {

        int Choice;
        String userName=null ;
        String DOB=null;
        long mobileNo=0;
        int registrationNo=0;
        String accountNo = null;
        int balance=0;
        System.out.println("Welcome to MHETRE's Bank Pvt Ltd!!");
        Scanner scan = new Scanner(System.in);
        User account = new User();
        Map<String, User> map= new HashMap<String,User>();
        //   Iterator<user> it = obj.iterator();

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


                    System.out.println("Enter name:");
                    scan.nextLine();
                    userName = scan.nextLine();


                    System.out.println("Enter DOB:");
                    DOB = scan.nextLine();

                    System.out.println("Enter Mobile:");
                    mobileNo = scan.nextLong();

                    System.out.println("Enter Account:");
                    scan.nextLine();
                    accountNo = scan.nextLine();

                    System.out.println("Enter Registration No:");
                    registrationNo = scan.nextInt();

                    System.out.println("Enter Balance:");
                    balance = scan.nextInt();

                    account = new User(accountNo,userName,DOB,mobileNo,registrationNo,balance);
                    map.put(accountNo, account);
                    break;

                }

                case 2: {

                    System.out.println("Enter Account number to remove from list");
                    scan.nextLine();
                    accountNo=scan.nextLine();
                    if(map.containsKey(accountNo))
                    {
                        map.remove(accountNo);
                        System.out.println("1 Account Deleted!");
                    }
                    else
                    {
                        System.out.println("Account is not present!");
                    }


                    break;

                }
                case 3: {
                    System.out.println("Enter account to which you wanted to send money:");
                    scan.nextLine();
                    String receiverAccount = scan.nextLine();

                    System.out.println("Enter payee account number:");
                    String senderAccount = scan.nextLine();

                    System.out.println("\nEnter Amount: ");
                    int dAmount = scan.nextInt();

                    User sender= map.get(senderAccount);
                    User receiver = map.get(receiverAccount);
                    if(sender.getBalance()>=dAmount){
                        sender.setBalance(sender.getBalance() - dAmount);
                        receiver.setBalance(receiver.getBalance() + dAmount);

                    }
                    else{
                        System.out.println("Insufficient Balance!");
                    }
                    map.put(senderAccount,sender);
                    map.put(receiverAccount,receiver);
//
//
//                    if(map.containsKey(debitAccount))
//                    {
//                        balance= (balance+dAmount);
//                     //   System.out.println("Total balance Updated"+(balance+dAmount));
//
//                       map.put(debitAccount,account);
//                        System.out.println("credited!");
//
//                    }
//

                }
                case 4: {
                    System.out.println(map);
//                    System.out.println("Account No: \t\t"+"User Name: \t\t" + "DOB\t\t"+"Mobile No:\t\t"+"Registration No\t\t"+"Balance\t\n");
//                    for(Map.Entry<String,User> entry:map.entrySet()){
//                        User account1=entry.getValue();
//                        System.out.println(account1.accountNo+"  \t"+account1.userName+"  \t  "+account1.DOB+"  \t "+account1.mobileNo+"  \t"+account1.registrationNo+"  \t"+account1.balance+"  \t\n");
                    }

                    break;


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
