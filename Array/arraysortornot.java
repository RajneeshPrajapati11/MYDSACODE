import java.util.*;



public class arraysortornot{

     public static boolean isSortedAscend(int arr[],int n){
             
        for(int i =1;i<n;i++){

            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
     }

     public static boolean isSortedDescend(int arr[],int n){
             
        for(int i =0;i<n-1;i++){

            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
     }





    public static void main(String[]args ){
        
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

        //now check array is sorted or not

        boolean ans1 = isSortedAscend(arr,n);

        boolean ans2 = isSortedDescend(arr,n);

        if(ans1==true||ans2==true){
            System.out.println("yes array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }

        s.close();
    }
}