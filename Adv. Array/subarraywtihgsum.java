public class subarraywtihgsum {
    
    //_______________________________________________Naive solution_____________________________________________________________
    // static boolean checksum(int arr[],int sum){

    //     int n = arr.length;

    //     for(int i=0;i<n;i++){

    //         int curr_sum=0;

    //         for(int j=i;j<n;j++){

    //             curr_sum+=arr[j];

    //             if(curr_sum==sum){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    //________________________________________________Efficient Solution using sliding window(varisable size)___________________________________________

    static boolean checksum(int arr[],int sum){

        int s=0;int e=0;
        int curr_sum =0;
        int n = arr.length;
        for(e=0;e<n;e++){
            
            curr_sum+=arr[e];

            while(curr_sum>sum){

                curr_sum=curr_sum-arr[s];
                s++;
            }

            if(curr_sum==sum){

                return true;
            }
            
        }
        return false;
    }
    
    public static void main(String[]args){
        
        int arr[]={1,4,20,3,10,5};
        
        int sum = 33;

       
        System.out.println( checksum(arr,sum));
    }
}
