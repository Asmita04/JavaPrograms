package JavaCollections;

import java.util.*;

public class LinkedListDemo1 {
    class Node {
        String UserName;
        int AccountNumber;
        long MobileNo;
        Node next;   //Aggregate

        Node(String UserName, int AccountNumber, long MobileNo) {
            this.UserName = UserName;
            this.AccountNumber = AccountNumber;
            this.MobileNo = MobileNo;
            this.next = null;
        }
    }
    public Node head = null;
    public void addFirst(String UserName,int AccountNumber, long MobileNo)
    {
        Node newNode= new Node(UserName,AccountNumber,MobileNo);
        if(head == null)
        {
            head =newNode;
            return;
        }

        newNode.UserName=UserName;
        newNode.AccountNumber=AccountNumber;
        newNode.MobileNo=MobileNo;
        newNode.next= head;
        head = newNode;
    }
    void deleteNode(int AccountNumber)
    {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.AccountNumber == AccountNumber) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.AccountNumber != AccountNumber) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }



    /* public void delete(int AccountNumber)
    {
        LinkedListDemo1.Node ptr = head;
        LinkedListDemo1.Node temp;
        while(ptr.next.AccountNumber!=AccountNumber)
        {
            temp=ptr.next;
            ptr.next=temp.next;
            ptr=ptr.next;
        }

    }*/
    public void display() {
        //Node current will point to head
        LinkedListDemo1.Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.UserName+ " "+current.AccountNumber+" "+current.MobileNo+"\n");
            current = current.next;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        LinkedListDemo1 obj =new LinkedListDemo1();
        obj.addFirst("Asmita",457,85749654);
        obj.addFirst("Ajay",85296316,827549314);
        obj.display();
        System.out.println("After delete:\n");
        obj.deleteNode(457);
        obj.display();
    }
}
