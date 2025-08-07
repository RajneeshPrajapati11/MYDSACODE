public class creationdoublelinked{

    //node class
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){

            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

   // printlist function
   
   static void printlist(Node head){

     Node curr=head;
     while(curr!=null){
        
        System.out.print(curr.data+" ");
        
        curr=curr.next;
     }

   }
    
    
    
    
    
    
    
    // Main driver function

    public static void main(String[]args){

        Node head = new Node(10);
        Node temp1= new Node(20);
        Node temp2= new Node(30);

        head.next=temp1;
        temp1.prev=head;

        temp1.next=temp2;
        temp2.prev=temp1;
        

        printlist(head);

    }
}