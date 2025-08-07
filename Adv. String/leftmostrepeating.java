import java.util.*;


public class leftmostrepeating {
    //------------------------------Naive solution------------------------------------
    // static int leftmost(String s){
        

    //     for(int i=0;i<s.length();i++){
    //         for(int j=i+1;j<s.length();j++){
    //             if(s.charAt(i)==s.charAt(j)){
    //                 return i;
    //             }
    //         }
    //     }
    //     return -1;
    // }


    //----------------------------------Better Approach-----------------------------------------------------------
    // static final int CHAR=256; 
    
    // static int leftmost(String s){
         
    //     int count[]=new int[CHAR];

    //     for(int i=0;i<s.length();i++){

    //         count[s.charAt(i)]++;
    //     }

    //     for(int i=0;i<s.length();i++){

    //         if(count[s.charAt(i)]>1){
    //             return i;
    //         }
    //     }

    //     return -1;
        
    // }


   //-----------------------------------------Efficient solution-1--------------------------------------------------------------------------

//    static final int CHAR=256; 
//    static int leftmost(String s){
       
//       int findex[]=new int[CHAR];
//       Arrays.fill(findex,-1);

//       int res = Integer.MAX_VALUE;

//       for(int i=0;i<s.length();i++){

//         int fi = findex[s.charAt(i)];

//         if(fi==-1){
//             findex[s.charAt(i)]=i;
//         }
//         else{
//             res=Math.min(res,fi);
//         }
//       }

//       return (res==Integer.MAX_VALUE)?-1:res;
//    }


//------------------------------------------------------------------Efficient solution-2---------------------------------------------------------

static final int CHAR=256;
static int leftmost(String s){
    boolean []visited = new boolean[CHAR];

    int res=-1;

    for(int i=s.length()-1;i>=0;i--){
          
        if(visited[s.charAt(i)]){
            res=i;
        }

        else{
            visited[s.charAt(i)]=true;
        }
    }

    return res;
}


    
    public static void main(String[]args){
        String s="abbcc";
        
        System.out.println(leftmost(s));
        
    }
}
