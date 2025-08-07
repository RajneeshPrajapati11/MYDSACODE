public class insertatbegin {
    static class Node{

        int data;
        Node next;

        Node(int data){

            this.data=data;
            this.next=null;
        }
    }
    
    //for traverse and printing element
    //-----------------------------------------------------------Naive solution in o(n)------------------------------------------------------------
    // static Node insertbegin(Node head){

    //     Node temp = new Node(50);

    //     if(head==null){
    //         temp.next=temp;
    //         return temp;
    //     }
    //     else{

    //         Node curr=head;
    //         while(curr.next!=head){
    //             curr=curr.next;
    //         }
    //         curr.next=temp;
    //         temp.next=head;

    //         return temp;
    //     }
    // }

    //---------------------------------------------------------------Efficient Solution in o(1)--------------------------------------------------
    //----------------------------------------------------second node pe insert kro or phir unke data swap krdo-------------------------------
     static Node insertbegin(Node head){

        Node temp = new Node(50);

        if(head==null){
            temp.next=temp;
            return temp;
        }
        else{

           temp.next=head.next;
           head.next=temp;
           int t=head.data;
           head.data=temp.data;
           temp.data=t;

           return head;
        }
    }

     static void printlist(Node head){

        if(head==null){
            return ;
        }
        System.out.print(head.data+" ");

        for(Node r=head.next;r!=head;r=r.next){
            System.out.print(r.data+" ");
        }

        System.out.println();
    }
    
    
    
    
    public static void main(String[]args){
          
        Node head= new Node(10);
        head.next=new Node(5);
        head.next.next=new Node(20);
        head.next.next.next=new Node(15);
        head.next.next.next.next=head;

        printlist(head);
        
        head=insertbegin(head);

        printlist(head);

    }
}
