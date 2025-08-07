import java.util.*;



public class arrayAverage{
     

    public static double sumOfArray(int arr[],int n){

        double sum = 0;
        double count = 0;

        for(int i=0;i<n;i++){

            sum=sum+arr[i];
            count++;
        }

        double avg = sum/count;
        return avg;
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

        double avg = sumOfArray(arr, n);

        System.out.println("Avg of the array is :"+avg);
    }    

}