public class movezeroend {
    
    //--------------------------------------------------Naive Solution------------------------------------------------------------------
    // public static void movetoend(int arr[],int n){
          
    //     for(int i=0;i<n;i++){

    //         if(arr[i]==0){

    //             for(int j=i+1;j<n;j++){

    //                 if(arr[j]!=0){
    //                     int temp = arr[i];
    //                     arr[i]=arr[j];
    //                     arr[j]=temp;
    //                 }
    //             }
    //         }
    //     }
    // }

    //-----------------------------------------------------------Efficient---------------------------------------------------------------------

    public static void movetoend(int arr[],int n){
        int count =0;

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
    }
    
    
    public static void main(String[]args){

        int arr[]={10,5,0,0,8,0,9,0};

        int n = 8;

        System.out.println("before moving zeroes to end: ");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.println("after moving zeroes to end: ");
        
        movetoend(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
