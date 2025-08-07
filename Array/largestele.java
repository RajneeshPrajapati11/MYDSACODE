import java.util.*;




public class largestele {

   public static int topele(int arr[],int n){
       
        //naive approach  here o(nsquare)complexity

        

        // for(int i=0;i<n;i++){
        //     boolean ismax=true;
        //     for(int j=i+1;j<n;j++){

        //         if(arr[i]<arr[j]){
        //             ismax=false;
        //             break;
        //         }

        //     }
        //     if(ismax==true){

        //         return arr[i];
        //     }
            



        // }
        // return -1;


        //efficient approach

        int max = arr[0];

        for(int i=1;i<arr.length;i++){
              if(arr[i]>max){
                max=arr[i];
              }
        }
        return max;  //here is o(n)time complexity


    }

    public static void main(String[]args){

        int arr[]={10,20,20,30,40};

        int n = arr.length;

        int res = topele(arr,n);

        System.out.println("maximum element in an array:"+res);
    }
}
