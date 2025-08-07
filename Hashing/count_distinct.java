

import java.util.*;

class count_distinct{

    static int count_dist(int arr[]){

        //--------------------------------------------------Naive Solution---------------------------------------------------------------------
        // int n = arr.length;

        // int res = 0;
        // for(int i=0;i<n;i++){
        //     boolean flag = false;

        //     for(int j=0;j<i;j++){

        //         if(arr[i]==arr[j]){
        //             flag = true;
        //         }
        //     }

        //     if(flag==false){
        //         res++;
        //     }
        // }
        // return res++;



        //-----------------------------------------Efficient Solution by using Hashset-----------------------------------------------------------


        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }

        return hs.size();


    }



    public static void main(String[]args){

        int arr[] = {10,10,10,20,40};

        

        int m = count_dist(arr);
        System.out.println(m);
    }
}


