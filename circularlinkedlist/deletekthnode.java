public class deletekthnode {
     static class Node{

        int data;
        Node next;

        Node(int data){

            this.data=data;
            this.next=null;
        }
    }
    //function for  kth node

    static Node deletekth_node(Node head,int n){

        if(head==null){
            return head;
        }
        if(n==1){
            return delete_head(head);
        }

        Node curr=head;
        for(int i=0;i<n-2;i++){
            curr=curr.next;
        }

        curr.next=curr.next.next;
        return head;
    }

    // for delete only head
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
        int n=2;
        head=deletekth_node(head,n);

        printlist(head);

    }
}
