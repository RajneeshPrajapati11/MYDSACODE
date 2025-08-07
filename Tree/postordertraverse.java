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





public class postordertraverse {
     
    // for postorder traverse
    static void postorder(Node root){

        if(root!=null){

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key+" ");
        }
    }

    
    // Main driver function
    public static void main(String []args){
          
        Node root = new Node(10);
        root.left= new Node(20);
        root.right= new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);

        postorder(root);
    }
}

