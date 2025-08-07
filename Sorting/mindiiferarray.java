import java.util.*;

public class mindiiferarray {
    
    //---------------------------------------------------------Naive solution-------------------------------------------------------------
    
    // static int getmindiff(int arr[]){
        
    //     int n=arr.length;

    //     int res=Integer.MAX_VALUE;

    //     for(int i=1;i<n;i++){

    //         for(int j=0;j<i;j++){
                
    //             res=Math.min(res,Math.abs(arr[i]-arr[j]));
    //         }
    //     }
    //     return res;
    // }
    
    
    //------------------------------------------------------------------Efficient solution-----------------------------------------------
    
    static int getmindiff(int arr[]){
        
        int n=arr.length;
        Arrays.sort(arr);
        int res=Integer.MAX_VALUE;

        for(int i=1;i<n;i++){

           res=Math.min(res,arr[i]-arr[i-1]);
        }
        return res;
    }
    
    
    
    
    public static void main(String[]args){

        int arr[]={1,8,12,5,18};

        int x = getmindiff(arr);

        System.out.println("the minimum difference in the array: "+x);
    }
}
