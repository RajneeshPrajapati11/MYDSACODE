import java.util.*;

public class leftmostnonrepeating {
    
    //-------------------------------------------------------Naive Solution----------------------------------------------------------------
    // static int nonrepeating(String s){

    //     for(int i=0;i<s.length();i++){
    //         boolean flag = false;
    //         for(int j=0;j<s.length();j++){
                
    //             if(i!=j&&s.charAt(i)==s.charAt(j)){

    //                 flag=true;
    //                 break;
    //             }
    //         }
    //         if(flag==false){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    
    //--------------------------------------------------------------Better Solution----------------------------------------------------------

    // static int CHAR=256;
    // static int nonrepeating(String s){
         
    //     int count[]=new int[CHAR];

    //     for(int i=0;i<s.length();i++){

    //         count[s.charAt(i)]++;
    //     }

    //     for(int i=0;i<256;i++){

    //         if(count[s.charAt(i)]==1){
    //             return i;
    //         }
    //     }

    //     return -1;
    // }

    //----------------------------------------------------Efficient solution--------------------------------------------------------------------
    
    static final int CHAR =256;

    static int nonrepeating(String s){

        int fi[]=new int[CHAR];
        Arrays.fill(fi,-1);

        for(int i=0;i<s.length();i++){

            if(fi[s.charAt(i)]==-1){
                fi[s.charAt(i)]=i;
            }
            else{
                fi[s.charAt(i)]=-2;
            }
        }

        int res =Integer.MAX_VALUE;

        for(int i=0;i<CHAR;i++){

            if(fi[i]>=0){
                res= Math.min(res,fi[i]);
            }
        }

        return (res==Integer.MAX_VALUE)?-1:res;

    }



    public static void main(String[]args){

        String s="geeksforgeeks";
        
        System.out.println(nonrepeating(s));
        
    }
}
