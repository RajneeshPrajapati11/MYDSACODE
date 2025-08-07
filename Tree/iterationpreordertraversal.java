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





public class iterationpreordertraversal {
     
    // for iteration preordertraversal ---space complexity o(n)
    // static void iterationpreorder(Node root ){
       
    //     if(root==null){
    //         return ;

    //     }
    //     Stack<Node>st=new Stack<>();
    //     st.push(root);

    //     while(st.isEmpty()==false){
            
    //         Node curr=st.pop();
    //         System.out.print(curr.key+" ");

    //         if(curr.right!=null){
    //             st.push(curr.right);
    //         }
    //         if(curr.left!=null){
    //             st.push(curr.left);
    //         }
    //     }
            
    // }


    //------------------------------------Space complexity optimize o(h)---------------------------------------------------------------------
    static void iterationpreorder(Node root ){
       
        if(root==null){
            return ;

        }
        Stack<Node>st=new Stack<>();
        Node curr=root;
        
        while(curr!=null || st.isEmpty()==false){

            while(curr!=null){

                System.out.print(curr.key+" ");

                if(curr.right!=null){
                    st.push(curr.right);
                }
                curr=curr.left;
            }

            if(st.isEmpty()==false){
                curr=st.pop();
            }
        }
    }

    
    // Main driver function
    public static void main(String []args){
          
        Node root = new Node(10);
        root.left= new Node(20);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right= new Node(30);
        
        

      
        iterationpreorder(root);
        
    }
}




    



