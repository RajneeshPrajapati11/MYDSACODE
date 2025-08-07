public class selectionsort {
    
    //-----------------------------------------------naive solution ek temp array leke--------------------------------------------
    // static void selectsort(int arr[]){
        
    //     int n=arr.length;

    //     int temp[]=new int[n];

    //     for(int i=0;i<n;i++){
    //         int min_ind=0;
    //         for(int j=1;j<n;j++){
                
    //             if(arr[min_ind]>arr[j]){
    //                min_ind=j;

    //             }
    //         }
    //         temp[i]=arr[min_ind];
    //         int bada=Integer.MAX_VALUE;
    //         arr[min_ind]=bada;
    //     }

    //     for(int i=0;i<n;i++){
    //         arr[i]=temp[i];
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    
    //---------------------------------------------------------efficient solution--------------------------------------------------------------

    static void selectsort(int arr[]){
        
        int n=arr.length;

       

        for(int i=0;i<n;i++){
            int min_ind=i;
            for(int j=i+1;j<n;j++){
                
                if(arr[min_ind]>arr[j]){
                   min_ind=j;

                }
                
            }
            int temp=arr[i];
            arr[i]=arr[min_ind];
            arr[min_ind]=temp;
           
            
        }

        for(int i=0;i<n;i++){
           
            System.out.print(arr[i]+" ");
        }
    }
    
    
    public static void main(String[]args){

        int arr[]={10,5,8,20,2,18};

        selectsort(arr);
    }
}
