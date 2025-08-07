



class searchiterative{
    
    static class Node{
        int data;
        Node next;
        Node(int x){
           
            data=x;
            next=null;

        }
    }
    public static void main(String[]args){
        
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        int x=40;

        System.out.println(find(head,x));
        
    }

    public static int find(Node head,int x){

        Node curr=head;
        int pos=1;
        while(curr!=null){

            if(curr.data==x){
                
                return pos;
            }
            else{
               pos++;
               curr=curr.next;
            }
        }
        return -1;
        
    }


   
}
