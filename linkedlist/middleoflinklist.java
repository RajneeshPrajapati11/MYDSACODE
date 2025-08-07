public class middleoflinklist {
       // node class
    static class Node{

        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    //middle of linkedlist



    //------------------------------------------------------Naive Solution--------------------------------------------------------------------
    // static void middle(Node head){
        
    //     if(head==null){
    //         return ;
    //     }

    //     int count=0;
    //     Node curr;

    //     for(curr=head;curr!=null;curr=curr.next){
    //         count++;
    //     }

    //     curr=head;

    //     for(int i=0;i<count/2;i++){
    //         curr=curr.next;
    //     }

    //     System.out.println(curr.data);

    // }
    
    //---------------------------------------------------------Efficient solution(slow pointer and fast pointer)1"---------------------------------------------------------
    static void middle(Node head){
        
        if(head==null){
            return ;
        }

        Node slow=head;
        Node fast=head;

        while(fast!=null&&fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
        }

        System.out.println(slow.data);



    }
    

    // main driver function
    public static void main(String[]args){
       Node head = new Node(10);
       head.next= new Node(30);
       head.next.next=new Node(50);
       head.next.next.next=new Node(70);
       
       
       
       middle(head);
       

    } 
}


