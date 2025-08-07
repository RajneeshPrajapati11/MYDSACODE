public class deletehead {
    static class Node{

        int data;
        Node next;

        Node(int data){

            this.data=data;
            this.next=null;
        }
    }
    
    
    //-----------------------------------------------------------Naive solution in o(n)------------------------------------------------------------
    // static Node delete_head(Node head){

    //     if(head==null){
    //         return null;
    //     }
    //     if(head.next==head){
    //         return null;
    //     }

    //     Node curr=head;

    //     while(curr.next!=head){
    //         curr=curr.next;
    //     }

    //     curr.next=head.next;

    //     return curr.next;

        
        
    // }

    //---------------------------------------------------------------Efficient Solution in o(1)--------------------------------------------------
    //----------------------------------------------------second node k data ko pahale pe le aao or phir head ko uske agle pe jod do-------------------------------
     static Node delete_head(Node head){

        if(head==null){
            return null;
        }
        if(head.next==head){
            return null;
        }
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }

    // for printing circular linkedlist
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
        
        head=delete_head(head);

        printlist(head);

    }
}
