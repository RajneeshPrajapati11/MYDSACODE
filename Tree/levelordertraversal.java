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





public class levelordertraversal {
     
    // for printing node using level order traversal
    static void levelorder(Node root ){
       
        if(root==null){
            return ;
        }

        Queue<Node>q=new LinkedList<>();

        q.add(root);

        while(q.isEmpty()==false){
            
            Node curr = q.poll();
            
            System.out.print(curr.key+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }

            if(curr.right!=null){
                q.add(curr.right);
            }



        }


        
    }

    
    // Main driver function
    public static void main(String []args){
          
        Node root = new Node(10);
        root.left= new Node(15);
        root.left.left=new Node(30);
        root.right= new Node(20);
        root.right.left=new Node(40);
        root.right.left.left=new Node(60);
        root.right.left.right=new Node(70);
        root.right.right=new Node(50);
        

      
        levelorder(root);
    }
}


