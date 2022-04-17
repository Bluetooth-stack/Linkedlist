/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author sid
 */
class Node{
    int data;
    Node next;
}
class List{
    Node head;
    void insert(int d){
        Node n = new Node();
        n.data=d;
        n.next=null;
        if(head==null){
            head=n;
        }
        else{
            Node t = head;
            while(t.next!=null){
                t=t.next;
            }
            t.next=n;
        }
    }
    void show(){
        Node node=head;
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
        //System.out.println(node.data);   
    }
    void insertAtStart(int d){
        Node node=new Node();
        node.data=d;
        node.next=null;
        node.next=head;
        head=node;
    }
    void insertAt(int index, int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        Node t=head;
        if(index==0){
            insertAtStart(data);
        }
        else{
        for(int i=0;i<index-1;i++){
            t=t.next;
        }
        node.next=t.next;
        t.next=node;
        }
    }
    void deleteAt(int index){
        if(index==0){
            head=head.next;
        }
        else{
            Node t=head;
            for(int i=0;i<index-1;i++){
                t=t.next;
            }
            Node n1=t.next;
            t.next=n1.next;
            //System.out.println("Deleted Element: "+n1.data);
            //n1 = null;
        }
    }
    void printMiddle(){
        Node fast=head;
        Node mid=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            mid=mid.next;
        }
        System.out.println("Middle of the list is: "+mid.data);
        //fast=null;
        //mid=null;
    }
    void sort(){
        Node current=head;
        Node index;
        if(head==null){
            System.out.println("Empty");
        }
        else{
            while(current!=null){
                index=current.next;
                while(index!=null){
                    if(current.data>index.data){
                        int temp=current.data;
                        current.data=index.data;
                        index.data=temp;
                    }
                    index=index.next;
                }
                current=current.next;
            }
        }
    }
    void reverse(){
        if(head==null){
            System.out.println("Empty");
        }
        else{
            Node current=head;
            Node prev=null;
            Node next;
            while(current!=null){
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;
            }
            head=current;
        }
        Node n=head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
}
public class Linkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List list=new List();
        list.insert(10);
        list.insert(12);
        list.insert(14);
        list.insert(20);
        list.insert(160);
        list.insert(112);
        list.insertAtStart(4);
        list.insertAt(0, 13);
        list.deleteAt(2);
        list.show();
        //list.printMiddle();
        //list.sort();
        //list.show();
        list.reverse();
        //list.show();
    }
    
}
