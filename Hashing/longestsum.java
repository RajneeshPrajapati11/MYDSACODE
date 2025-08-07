import java.util.*;

public class longestsum {
    
    static int longestsub_sum(int arr[],int target){

        // int res=0;
        // for(int i=0;i<arr.length;i++){
        //     int curr_sum=0;
        //     for(int j=i;j<arr.length;j++){
                 
        //         curr_sum=curr_sum+arr[j];

        //         if(curr_sum==target){

        //             res = Math.max(res,j-i+1);
        //         }
        //     }
        // }
        // return res;


        //--------------------------------------------Efficient--------------------------------------------------------------------

        HashMap<Integer,Integer>hm = new HashMap<>();
        
        int res=0; int curr_sum=0;

        for(int i=0;i<arr.length;i++){

            curr_sum = curr_sum+arr[i];

            if(curr_sum==target){
                res = i+1;
            }

            if(hm.containsValue(curr_sum)==false){
                hm.put(curr_sum,i);
            }

            if(hm.containsValue(curr_sum-target)){
                res = Math.max(res,i-hm.get(curr_sum-target));
            }
        }
        return res;
    }
    
    
    
    
    
    public static void main(String[]args){

        int arr[]={5,2,3,4};

        int target = 5;

        int n=longestsub_sum(arr,target);

        System.out.println("the longest subarray with given sum: "+ n);
    }
}
