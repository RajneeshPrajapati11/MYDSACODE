import java.util.*;


public class Countdistinctelement {
    
    public static int disElement(int arr[],int n){
         
        int count = 0;
        boolean isDistinct = true;
        
        for(int i =0;i<n;i++){

            for(int j=i-1;j>=0;j--){
                if(arr[i]==arr[j]){
                   
                    isDistinct= false;
                    break;

                }

                
            }
            if(isDistinct==true){
                count++;
            }
        }
        return count;
    }
    
    
    
    
    public static void main(String[]args){



        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        
        int n = s.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter the elements of the array");

        for(int i=0;i<arr.length;i++){

            arr[i] = s.nextInt();
        }
        
        System.out.println("the elements in the array");

        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]  );
        }

        int distinct = disElement(arr,n);

        System.out.println(distinct);

        s.close();
    }
}
