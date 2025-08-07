import java.util.*;


public class maximuminarray {
    
    public static int maxiInArray(int arr[],int n){

        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){

            if(max<=arr[i]){
                max=arr[i];
            }
        }

        return max;
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

        int ans = maxiInArray(arr, n);

        System.out.println("maximum in the array is :"+ans);
    }    
}
