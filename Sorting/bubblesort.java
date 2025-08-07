public class bubblesort{
    
    // static void bubble_sort(int arr[]){
    //     int n=arr.length;

    //     for(int i=0;i<n-1;i++){//n-1 isliyeh chaalyenge kyoki jab n-1 element sort ho chuke honge tohh last vaala(means first vaala sorted rahega)
           
    //         for(int j=0;j<n-i-1;j++){//yeh islieh last k element jo sort ho chuke pahale include naah krne k liyeh
                
    //             if(arr[j]>arr[j+1]){
    //                 int temp=arr[j+1];
    //                 arr[j+1]=arr[j];
    //                 arr[j]=temp;

    //             }
    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }

    //if array is sorted already then 
    static void bubble_sort(int arr[]){
        int n=arr.length;
        boolean swapped;//by doing this algorithm works in linear time
        for(int i=0;i<n-1;i++){//n-1 isliyeh chaalyenge kyoki jab n-1 element sort ho chuke honge tohh last vaala(means first vaala sorted rahega)
            swapped=false;
            for(int j=0;j<n-i-1;j++){//yeh islieh last k element jo sort ho chuke pahale include naah krne k liyeh
                
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped=true;

                }
            }
            if(swapped==false){
                break;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    
    
    
    
    public static void main(String[]args){

        int arr[]={10,8,20,5};
        
       // it is a stable algorithm because order maintenance during sorting
        

        bubble_sort(arr);
    }
}