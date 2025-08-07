import java.util.*;

// Node class
class Node{
    int key;
    Node left;
    Node right;

    Node(int k){
        key=k;
        left=right=null;
    }
}





public class iterationinordertraversal {
     
    // for iteration inordertraversal
    static void iterationinorder(Node root ){
       
        Stack<Node>st=new Stack<>();
        Node curr=root;

        while(curr!=null||st.isEmpty()==false){

            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }

            curr=st.pop();
            System.out.print(curr.key+" ");
            curr=curr.right;
        }


        
    }

    
    // Main driver function
    public static void main(String []args){
          
        Node root = new Node(10);
        root.left= new Node(20);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right= new Node(30);
        
        

      
        iterationinorder(root);
        
    }
}




    


