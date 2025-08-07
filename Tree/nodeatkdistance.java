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





public class nodeatkdistance {
     
    // for printing k distance element
    static void printkdist(Node root,int k){
         
        if(root==null){
            return ;

        }
        if(k==0){
            System.out.print(root.key+" ");
        }
        else{

            printkdist(root.left,k-1);
            printkdist(root.right,k-1);
        }
        
    }

    
    // Main driver function
    public static void main(String []args){
          
        Node root = new Node(10);
        root.left= new Node(20);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right= new Node(30);
        root.right.right=new Node(70);
        root.right.right.right=new Node(80);

        int k=2;
        printkdist(root,k);
    }
}

