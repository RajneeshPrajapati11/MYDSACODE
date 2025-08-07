public class deleteatend {
    
    // Node class
    static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // delete  at end function

    static Node deleteend(Node head){

        if(head==null){
            return null;
        }

        if(head.next==null){
            return null;
        }

        Node curr=head;

        while(curr.next.next!=null){
            curr=curr.next;
        }

        curr.next=null;
        return head;

    }
    
    
    //print the link list

    static void printlist(Node head){

        Node curr=head;

        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();


    }
    
    // main driver function
    public static void main(String[]args){
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        printlist(head);

        head=deleteend(head);

        printlist(head);

    }
}
