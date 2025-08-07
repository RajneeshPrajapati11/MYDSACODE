import java.util.*;



public class sumofarray {


    public static int sumOfArray(int arr[],int n){

        int sum = 0;

        for(int i=0;i<n;i++){

            sum=sum+arr[i];
        }

        return sum;
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

        int sum = sumOfArray(arr, n);

        System.out.println("maximum in the array is :"+sum);
    }    
}
