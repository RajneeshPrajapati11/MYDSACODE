

//Node class
class Node{

    int key;
    Node left,right;
    Node(int x){
        key=x;
    }
}






public class insertinbst{

    // //recursive function to insert in bst
    static Node insert(Node root,int x){

        if(root==null){
            return new Node(x);
        }
        if(root.key>x){
            root.left=insert(root.left,x);
        }
        else if(root.key<x){
            root.right=insert(root.right,x);
        }
        return root;
    }

    // iterative insert in bst
    //  static Node insert(Node root,int x){

    //     Node temp=new Node(x);
    //     Node parent=null;
    //     Node curr=root;
        
    //     while(curr!=null){
    //         parent=curr;
    //         if(curr.key>x){
    //             curr=curr.left;
    //         }
    //         else if(curr.key<x){
    //             curr=curr.right;
    //         }
    //         else{
    //             return root;
    //         }
    //     }
    //     if(parent==null){
    //         return temp;
    //     }
    //     if(parent.key>x){
    //         parent.left=temp;
    //     }
    //     else{
    //         parent.right=temp;
    //     }

    //     return root;


    // }

     // Inorder traversal to verify insertion
    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

   // main driver function
    public static void main(String[]args){
         
        Node root = new Node(15);

        root.left = new Node(5);

        root.left.left=new Node(3);

        root.right=new Node(20);

        root.right.right=new Node(80);

        root.right.left=new Node(18);
        root.right.left.left= new Node(16);

        int x=70;

        insert(root,x);
        root = insert(root, x);  // important to assign in recursive insert

        System.out.print("Inorder traversal after recursive insertion: ");
        inorder(root);

        // Print inorder to verify
        // System.out.print("Inorder traversal after insertion: ");
        // inorder(root);
        
    }
}
