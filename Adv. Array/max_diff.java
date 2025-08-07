public class max_diff {
    
    //-----------------------------------------------NAive solution----------------------------------------------------------------
    // static void maxdiff(int arr[]){

    //     int n=arr.length;

    //     int res = arr[1]-arr[0];

    //     for(int i=0;i<n;i++){
    //         for(int j= i+1;j<n;j++){

    //             res = Math.max(res,arr[j]-arr[i]);
    //         }
    //     }

    //     System.out.println("maximum difference:"+" "+res);
    // }

    //--------------------------------------------------Efficient solution----------------------------------------------------------

    static void maxdiff(int arr[]){

        int n = arr.length;

        int res = arr[1]-arr[0];

        int minval = arr[0];

        for(int j=1;j<n;j++){

            res = Math.max(res,arr[j]-minval);

            minval=Math.min(minval, arr[j]);


        }

        System.out.println("The maximum differenceis : "+res);
    }
    
    
    
    
    public static void main(String[]args){
        
        int arr[] = {2,3,10,6,4,8,1};

        maxdiff(arr);
    }
}
