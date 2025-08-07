public class deleteatbegin {
    
    //create node class to initailize it
    static class Node{

        int data;
        Node next;

        Node(int data){

            this.data=data;
            this.next=null;
        }

    }

    //to delete at begining

    static Node deletebegin(Node head){
       
        if(head==null){
            return null;
        }
        else{
            return head.next;
        }
    }
    
    //to printlist

    static void printlist(Node head){
         
        Node curr = head;

        while(curr!=null){
            System.err.print(curr.data+" ");
            curr= curr.next;
        }
        System.err.println();
    }
    
    // main driver function
        public static void main(String[]args){
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next=new Node(30);

        printlist(head);
        head = deletebegin(head);
        printlist(head);

    }
}
