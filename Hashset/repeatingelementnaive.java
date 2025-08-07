import java.util.*;



public class repeatingelementnaive {
    


    public static void distinctElementNaive(int arr[],int n){

        for(int i=1;i<n;i++){
            boolean flag = false;
            for(int j=0;j<i;j++){

               if(arr[i]==arr[j]){
                   flag = true;
                   break;
               }
            }

            if(flag==true){
                System.out.println(arr[i]);
            }
        }
    }


    public static void main(String[]args){

        int n = 4;
        
        int []arr = {2,2,2,2};
        
        distinctElementNaive(arr,n);

    }
}


