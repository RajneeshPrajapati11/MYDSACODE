public class consecutiveones {
    
    //---------------------------------------Naive Solution--------------------------------------------------------

    // static int lagataar_ek(int arr[]){

    //     int n = arr.length;

    //     int res =0;

        

    //     for(int i=0;i<n;i++){
    //         int count = 0;

    //         for(int j=i;j<n;j++){
    //             if(arr[j]==1){
    //                 count++;
    //             }
    //             else{
    //                 break;
    //             }
    
                
    //         }
    //         res = Math.max(res,count);
    //     }

    //     return res;
    // }


    //------------------------------------------------------Efficient Solution------------------------------------------------------------------


    static int lagataar_ek(int arr[]){

        int n = arr.length;

        int curr=0;

        int res =0;

        for(int i=0;i<n;i++){

            if(arr[i]==0){
                curr=0;
            }
            else{
                curr++;
                res = Math.max(curr,res);
            }
        }

        return res;
    }
    
    
    
    
    
    
    
    public static void main(String[]args){

        int arr[]={0,1,1,1,0,0,1,1};

        int m=lagataar_ek(arr);

        System.out.println(m);
    }
}
