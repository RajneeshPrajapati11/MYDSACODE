

//Node class
class Node{

    int key;
    Node left,right;
    Node(int x){
        key=x;
    }
}






public class searchinbst{

    // recursive function to search in bst
    // static boolean search(Node root,int x){

    //     if(root==null){
    //         return false;
    //     }
    //     else if(root.key==x){
    //         return true;
    //     }
    //     else if(root.key<x){
    //         return search(root.right,x);
    //     }
    //     else{
    //         return search(root.left,x);
    //     }
    // }

    // iterative search in bst
     static boolean search(Node root,int x){

        while(root!=null){

            if(root.key==x){
                return true;
            }

            else if(root.key<x){
                root=root.right;
            }
            else{
                root=root.left;
            }
        }
        return false;
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

        int x=18;

        System.out.println(search(root,x));
        
    }
}