public class findnthnodefromend {
    static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    
    //----------------------------------------------------Method-1--------------------------------------------------------------------
    // static void findnode(Node head,int n){

    //     int len=0;

    //     for(Node curr=head;curr!=null;curr=curr.next){
    //         len++;
    //     }
    //     if(len<n){
    //         return ;
    //     }
        
    //     Node curr=head;
    //     for(int i=0;i<len-n;i++){
    //         curr=curr.next;
    //     }

    //     System.out.println(curr.data);
    // }
    
    //-------------------------------------------------------------Method-2 using two pointer approach------------------------------------------
    
    static void findnode(Node head,int n){

        if(head==null){
            return ;

        }
        Node first=head;

        for(int i=0;i<n;i++){
            if(first==null){
                return ;
            }
            first=first.next;
        }

        Node second=head;

        while(first!=null){

            second=second.next;
            first=first.next;
        }

        System.out.println(second.data);
    }
    
    
    
    
    // main driver function

    public static void main(String[]args){

        Node head = new Node(10);
       head.next= new Node(30);
       head.next.next=new Node(50);
       head.next.next.next=new Node(70);
       
       int n=2;
       findnode(head,n);
    }
}
