

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





public class maximuminbt {
     
    // for return maximum in binary tree
    static int getmax(Node root ){
       
        if(root==null){
            return Integer.MIN_VALUE;
        }
        else{

           return Math.max(root.key,Math.max(getmax(root.left),getmax(root.right)));
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
        

      
        int max =getmax(root);
        System.out.println("Maximum of binary tree: "+max);
    }
}




    

