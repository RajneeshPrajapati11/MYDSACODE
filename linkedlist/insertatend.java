public class insertatend {
    
    // to initialize a node
    static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // to insert at the end of the node

    static Node insertend(Node head,int x){

        Node temp = new Node(x);

        if(head==null){
            return temp;
        }

        Node curr=head;

        while(curr.next!=null){

            curr = curr.next;

        }

        curr.next=temp;

        return head;
    }

    // to print for checking the result

    static void printlist(Node head){
         
        Node curr=head;

        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

  
    //main driver function
    public static void main(String[]args){

        Node head=null;
        head=insertend(head,10);
        head=insertend(head,20);
        head=insertend(head,30);
        head=insertend(head,40);

        printlist(head);

    }
}
