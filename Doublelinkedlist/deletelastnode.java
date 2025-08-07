public class deletelastnode {
    
    
    
   
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

   //reverse double linked list function

   static Node deletelast(Node head){

        if(head==null||head.next==null){
            return null;
        }
    Node curr=head;
    while(curr.next!=null){
        curr=curr.next;
    }

    curr.prev.next=null;
    return head;

        

   }
   
   
   
   
   
   
   
    // printlist function
   
   static void printlist(Node head){

     Node curr=head;
     while(curr!=null){
        
        System.out.print(curr.data+" ");
        
        curr=curr.next;
     }

     System.out.println();

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

        head=deletelast( head);

        printlist(head);

    }
}





