public class sw_sumofk_consecutive {
    //___________________________________________________Naive Solution_______________________________________________________________
    
    // static int sumof_k_consecutive(int arr[],int k){

    //     int max_sum = Integer.MIN_VALUE;
    //     int n = arr.length;
    //     for(int i=0;i+k<n;i++){

    //         int curr_sum=0;
    //         for(int j=0;j<k;j++){
    //             curr_sum+=arr[i+j];
    //         }

    //         max_sum=Math.max(max_sum,curr_sum);
    //     }
    //     return max_sum;
    // }

    //____________________________________________________________Efficient Solution________________________________________________
    static int sumof_k_consecutive(int arr[],int k){
        int n= arr.length;

        int curr_sum=0;
        

        for(int i=0;i<k;i++){
           curr_sum+=arr[i];
        }
        int res = curr_sum;
        for(int i=k;i<n;i++){

            curr_sum = curr_sum+arr[i]-arr[i-k];

            res = Math.max(res,curr_sum);
        }

        return res;
    }

    public static void main(String[]args){

        int arr[]={1,8,30,-5,20,7};

        int k=3;

        int m = sumof_k_consecutive(arr,k);

        System.out.println("The maximum sum of k consecutive elements is : "+m);
    }
}
