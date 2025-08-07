public class circulardoublelinked {
    
    
    
    
   
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

   static Node insertindouble(Node head){

        Node temp3=new Node(80);
        if(head==null){
            temp3.next=temp3;
            temp3.prev=temp3;
            return temp3;

        }

        temp3.prev=head.prev;
        temp3.next=head;
        head.prev.next=temp3;
        head.prev=temp3;

        return temp3;

        

   }
   
   
   
   
   
   
   
    // printlist function
   
   static void printlist(Node head){

     if (head == null) return;

        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);

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

        temp2.next=head;
        head.prev=temp2;
        

        printlist(head);

        head=insertindouble( head);

        printlist(head);

    }







}
