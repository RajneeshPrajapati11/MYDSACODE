public class insertatanyposition {
    // node class
    static class Node{

        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    //insert at any position

    static Node insertanyposition(Node head,int data,int pos){
        
        Node temp = new Node(data);

        if(pos==1){
            temp.next=head;
            return temp;
        }

        Node curr=head;
        
        for(int i=1;i<=pos-2&&curr!=null;i++){
            
            curr=curr.next;
        }

        if(curr==null){
            return null;
        }

        temp.next=curr.next;
        curr.next=temp;

        return head;

    }
    

    //printlist
    static void printlist(Node head){
       
        Node curr= head;
        while(curr!=null){

            System.out.print(curr.data+" ");
            curr=curr.next;
        }

        System.out.println();

    }
    

    // main driver function
    public static void main(String[]args){
       Node head = new Node(10);
       head.next= new Node(30);
       head.next.next=new Node(50);
       head.next.next.next=new Node(70);
       
       int pos=3;
       printlist(head);
       head=insertanyposition(head, 40,pos);
       printlist(head);

    }
}
