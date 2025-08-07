public class insertatend {
   
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

   //insertbegin function

   static Node insertend(Node head){

        Node temp=new Node(40);
        
        if(head==null){
            return temp;
        }

        Node curr=head;

        while(curr.next!=null){
            curr=curr.next;
        }

        curr.next=temp;
        temp.prev=curr;

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

        head=insertend( head);

        printlist(head);

    }
}

