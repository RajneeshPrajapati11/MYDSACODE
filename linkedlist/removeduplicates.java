
public class removeduplicates {
    
    // Node class
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    // duplicate remove function in sorted linkedlist

    static void removeDups(Node head){

        Node curr=head;

        while(curr!=null&&curr.next!=null){
            
            
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }

            else{
            curr=curr.next;
          }
        }


        //print list after removing element

        Node curr1=head;

        while(curr1!=null){
            System.err.print(curr1.data+" ");
            curr1=curr1.next;
        }
        
    }

    

    

    
    
    public static void main(String[]args){

       Node head = new Node(10);
       head.next= new Node(30);
       head.next.next=new Node(30);
       head.next.next.next=new Node(70);

       removeDups(head);
    }
}
