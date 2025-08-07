import java.util.*;

public class left_d_place{
    
    //------------------------------------------------Naive Approach-------------------------------------------------
    
    // static void leftrotatebyone(int arr[]){

    //     int n = arr.length;
    //     int temp = arr[0];
    //     for(int i=1;i<n;i++){
           
    //         arr[i-1]=arr[i];
    //     }

    //     arr[n-1]=temp;
    // }
    
    // static void leftrotate(int arr[],int d){
    //     for(int i=1;i<=d;i++){
    //         leftrotatebyone(arr);
    //     }
    // }


    //------------------------------------------Better Approach function----------------------------------------------------------


    // static void leftrotate(int arr[],int d){
    //     int temp[] = new int[arr.length];
    //     int n = arr.length;

    //     for(int i=0;i<d;i++){
    //         temp[i]=arr[i];
    //     }

    //     for(int i=d;i<arr.length;i++){
    //         arr[i-d]=arr[i];
    //     }

    //     for(int i=0;i<d;i++){
    //         arr[n-d+i]=temp[i];
    //     }
    // }


    //-------------------------------------------------final best approach-------------------------------------------------------------


    static void leftrotate(int arr[],int d){
        int n = arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }


    static void reverse(int arr[],int low,int high){

        while(low<=high){
            int temp = arr[low];

            arr[low]=arr[high];
            arr[high]=temp;

            low++;
            high--;
        }
    }
    



    public static void main(String[]args){

        
        
        int arr[]={1,2,3,4,5};

        int d =2;

        // System.out.println("before rotation");

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // System.out.println("after rotation");
        
        // leftrotate(arr, d);

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        


        //--------------------------------------------Better Approach-----------------------------------------------------

        // System.out.println("before rotation");

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // System.out.println("after rotation");
        
        // leftrotate(arr, d);

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        

        //-----------------------------------------------final best Approach---------------------------------------------------

        System.out.println("before rotation");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("after rotation");
        
        leftrotate(arr, d);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}