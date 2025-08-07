import java.util.*;

public class given_sum {
    
    static boolean isgivensum_present(int arr[],int target){

        // for(int i=0;i<arr.length;i++){

        //     int presum =0;

        //     for(int j=i;j<arr.length;j++){

        //         presum = presum+arr[j];

        //         if(presum==target){
        //             return true;
        //         }
        //     }
            
        // }
        // return false;


        //----------------------------------------------------Efficient solution---------------------------------------------------------------

        HashSet<Integer> h = new HashSet<>();

        int presum =0;
        for(int i=0;i<arr.length;i++){
            presum = presum + arr[i];

            if(h.contains(presum-target)){
                return true;
            }

            if(presum==target){
                return true;
            }

            h.add(presum);



        }
        return false;
    }
    
    
    
    
    
    
    
    public static void main(String[]args){

        int arr[]={5,8,6,13};
        int target = 14;

        isgivensum_present(arr,target);
    }
}
