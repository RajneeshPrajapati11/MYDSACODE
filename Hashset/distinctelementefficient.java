import java.util.*;

public class distinctelementefficient {
    
    public static void printDistinct(int arr[]){
          HashSet<Integer>s = new HashSet<>();
          
        for(int i=0;i<arr.length;i++){

            if(s.contains(arr[i])==false){
               
                System.out.println(arr[i]+" ");
                
                s.add(arr[i]);

            }
        }


    }
    public static void main(String[]args){
        
        int []arr= {10,8,10,10,7};

        printDistinct(arr);
       
    }
}
