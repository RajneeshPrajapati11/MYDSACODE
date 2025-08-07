import java.util.*;


public class zero_sum {
    
    static boolean is_zerosum_subarray(int arr[]){

        // for(int i=0;i<arr.length;i++){
        //     int sum =0;

        //     for(int j=i;j<arr.length;j++){
        //         sum = sum+arr[j];

        //         if(sum==0){
        //             return true;
        //         }
        //     }
        // }
        // return false;


        //----------------------------------------------Efficient Solution------------------------------------------------------------

        HashSet<Integer>h=new HashSet<>();

        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];

            if(h.contains(sum)){
                return true;
            }
            if(sum==0){
                return true;
            }

            h.add(sum);
        }
        return false;

    }
    
    
    public static void main(String[]args){

        int arr[]={1,4,13,-3,-10,5};

        is_zerosum_subarray(arr);
    }
}
