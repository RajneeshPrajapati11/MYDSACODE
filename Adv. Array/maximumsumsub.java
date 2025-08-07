public class maximumsumsub {
    
    
    // static int sabse_bada_sum_subarray(int arr[]){

    //     int n =arr.length;

    //     int res = arr[0];

    //     for(int i=0;i<n;i++){

    //         int sum =0;

    //         for(int j=i;j<n;j++){

    //             sum = sum+arr[j];

    //             res=Math.max(res, sum);
    //         }
    //     }
    //     return res;
    // }

    //------------------------------------------------------Efficient-----------------------------------------------------------------

    static int sabse_bada_sum_subarray(int arr[]){

        int n = arr.length;

        int maxending=arr[0];

        int res = arr[0];

        for(int i=1;i<n;i++){

            maxending= Math.max(maxending+arr[i],arr[i]);

            res = Math.max(maxending, res);
        }
        return res;
    }
    
    
    
    
    
    public static void main(String[]args){

        int arr[]={1,-2,3,-1,2};

        int s=sabse_bada_sum_subarray(arr);
        System.out.println(s);
    }
}
