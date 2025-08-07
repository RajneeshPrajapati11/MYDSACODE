public class equilibrium {
    
    //_____________________________________________Naive Solution_________________________________________________________________
   
    // static boolean findequilibrium(int arr[]){

    //     int n= arr.length;

    //     for(int i=0;i<n;i++){

    //         int ls=0,rs=0;

    //         for(int j=0;j<i;j++){
    //             ls = ls+arr[j];
    //         }

    //         for(int k=i+1;k<n;k++){
    //             rs = rs+arr[k];
    //         }

    //         if(ls==rs){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    
    //_______________________________________________Efficient Solution_______________________________________________________________
    
    static boolean findequilibrium(int arr[]){

        int n = arr.length;
        
        int rs=0;
        for(int i=0;i<n;i++){
            rs=rs+arr[i];
        }

        int ls=0;
        for(int i=0;i<n;i++){

            rs = rs-arr[i];
            
            if(ls==rs){
                return true;
            }

            ls=ls+arr[i];
        }

        return false;
    }
    
    
    public static void main(String[]args){

        int arr[]={3,4,8,-9,20,6};

        System.out.println(findequilibrium(arr));
    }
}
