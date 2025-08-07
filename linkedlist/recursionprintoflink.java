public class recursionprintoflink {
    static class Node{
        int data;
        Node next;

        Node(int x){
            data=x;
            next=null;
        }
    }
    
    
    
    public static void main(String[]args){
        
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        rprintlist(head);//recursively print
    } 

    static void rprintlist(Node head){

        if(head==null){
            return;
        }
        System.out.print(head.data+" ");//recursively print
        rprintlist(head.next);
    }
}
