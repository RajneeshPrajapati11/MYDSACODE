

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





public class sizeofbinarytree {
     
    // for return size of binary tree
    static int sizebtree(Node root ){
       
        if(root==null){
            return 0;
        }
        else{

            int leftsize=sizebtree(root.left);
            int rightsize=sizebtree(root.right);
            int totalsize=1+leftsize+rightsize;
            return totalsize;
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
        

      
        int size =sizebtree(root);
        System.out.println("Size of binary tree: "+size);
    }
}



