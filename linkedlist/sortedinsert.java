public class sortedinsert {
    
    // Node class
    static class Node{

        int data;
        Node next;


        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    // insert in sorted linkedlist

    static Node sortinsert(Node head,int x){
          
        Node temp = new Node(x);

        if(head==null){
            return temp;
        }
        if(x<head.data){
            temp.next=head;
            return temp;
        }

        Node curr=head;

        while(curr.next!=null&&curr.next.data<x){
            curr=curr.next;
        }

        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
    
    
     // printlist
    static void printlist(Node head){
        Node curr=head;

        while(curr!=null){
           System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    
    public static void main(String[]args){

        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        printlist(head);

        head=sortinsert(head,25);

        printlist(head);
    }
}
