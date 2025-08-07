import java.util.*;

public class reverselinkedlist {
    
    // node class
    static class Node{

        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    // reversing function
    //----------------------------------------------------------------using auxiliary space---------------------------------------------------------
    // static Node revlinklist(Node head){

    //     ArrayList<Integer>arr=new ArrayList<>();

    //     for(Node curr=head;curr!=null;curr=curr.next){

    //         arr.add(curr.data);
    //     }

    //     for(Node curr=head;curr!=null;curr=curr.next){
            
    //         curr.data=arr.remove(arr.size()-1);
    //     }

    //     return head;
    // }
    
    //---------------------------------------------------------Efficient Solution----------------------------------------------------------
    static Node revlinklist(Node head){

        Node curr=head;
        Node prev=null;

        while(curr!=null){
            Node next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    // for printlist
    
    static void printlist(Node head){

        Node curr=head;

        while(curr!=null){

            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    
    
    public static void main(String[]args){
        
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next= new Node(30);
        head.next.next.next= new Node(40);
        
        printlist(head);
        head=revlinklist(head);
        printlist(head);

    }
}
