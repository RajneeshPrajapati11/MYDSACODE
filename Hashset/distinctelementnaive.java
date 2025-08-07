
import java.util.*;



public class distinctelementnaive {
    

    public static void distinctElementNaive(int arr[],int n){

        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=0;j<i;j++){

               if(arr[i]==arr[j]){
                   flag = true;
                   break;
               }
            }

            if(flag==false){
                System.out.println(arr[i]);
            }
        }
    }













    public static void main(String[]args){

        int n = 6;
        
        int []arr = {4,8,5,8,7,5};
        
        distinctElementNaive(arr,n);

    }
}
