public class LeaderInArray {

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 6, 5, 2};
        
        int[] leaders = leader(arr); // You will complete this function

        System.out.println("Leaders in the array:");
        for (int val : leaders) {
            if (val != -1) { // Skip unused positions
                System.out.print(val + " ");
            }
        }
    }

    // 🧠 Your task: Complete this function to return an array of leaders
    public static int[] leader(int[] arr) {
        // Your code here
       int result[]=new int[arr.length];

        int k=0;
       
       for(int i=0;i<arr.length;i++){
            boolean flag=false;
        for(int j=i+1;j<arr.length;j++){

                if(arr[i]<=arr[j]){
                    flag = true;
                    break;
                }
            }
           
            if(flag==false){
               
                result[k]=arr[i];
                k++;

            }
       }

       
       return result;


    }
}



