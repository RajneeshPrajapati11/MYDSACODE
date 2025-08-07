import java.util.*;

class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

class MyStack{
    
    //-------------------------------------------------------------Array implementation of stack------------------------------------------------

    // int arr[];
    // int cap;
    // int top;

    // MyStack(int c){
    //     top=-1;
    //     cap=c;
    //     arr=new int[cap];
    // }

    // void push(int x){
    //     if(top==cap-1){System.out.println("Stack is full");return;}
    //     top++;
    //     arr[top]=x;
    // }

    // int pop(){
    //     if(top==-1){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
    //     int res=arr[top];
    //     top--;
    //     return res;
    // }

    // int peek(){
    //     if(top==-1){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
    //     return arr[top];
    // }

    // int size(){
    //     return top+1;
    // }

    // boolean isEmpty(){
    //     return(top==-1);
    // }


    //----------------------------------------------------------------Arraylist implementation of stack------------------------------------------

    // ArrayList<Integer>al= new ArrayList<>();

    // void push(int x){
    //     al.add(x);
    // }

    // int pop(){

    //     int res=al.get(al.size()-1);
    //     al.remove(al.size()-1);
    //     return res;
    // }

    // int peek(){
    //     return al.get(al.size()-1);
    // }

    // boolean isEmpty(){
    //     return al.isEmpty();
    // }
    
    // int size(){
    //     return al.size();
    // }
    

    //--------------------------------------------------------------Linkedlist implementation of stack------------------------------------------
    
   Node head;
   int size;

   MyStack(){
     head=null;
     size=0;
   }

   int size(){
    return size;
   }

   boolean isEmpty(){
      return(head==null);
   }

   void push(int x){

    Node temp=new Node(x);
    temp.next=head;
    head=temp;
    size++;
   }

   int pop(){

      if(head==null){
        return Integer.MAX_VALUE;
      }
      int res=head.data;
      head=head.next;
      size--;
      return res;
   }

   int peek(){
      if(head==null){
        return Integer.MAX_VALUE;
      }
      return head.data;
   }
    



}





public class implementationofstack {
    public static void main(String[]args){
        MyStack s = new MyStack();
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}
