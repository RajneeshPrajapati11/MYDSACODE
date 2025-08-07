
public class ceilinbst {
   
   // ceil find function
   
    static Node ceil(Node root,int x) {

        Node res=null;
        while(root!=null){

            if(root.key==x){
                return root;
            }

            else if(root.key<x){
                root=root.right;
            }

            else{
                res=root;
                root=root.left;
            }
        }
        return res;
   }

  
   

   
   public static void main(String[] var0) {
        Node root=new Node(10);
    	root.left=new Node(5);
    	root.right=new Node(15);
    	root.right.left=new Node(12);
    	root.right.right=new Node(18);
    	int x=13;
    	
    	Node ceilNode = ceil(root, x);
        System.out.println("Floor of " + x + " is: " + (ceilNode != null ? ceilNode.key : "None"));
   }
}


