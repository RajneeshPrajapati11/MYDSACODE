import java.util.*;

public class practice {
    
    //---------------------------GREATEST ELEMENT IN AN ARRAY(Function)---------------------------------------
    
    // public static int greatestelement(int arr[]){
    //     int n = arr.length;

    //     int max = arr[0];
    //     int index=0;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]>max){
    //             max = arr[i];
    //             index =i;
    //         }
           
    //     }
    //     return index;
    // }


    //------------------------------------------------------------------------------------------------
    
    
    //--------------------------CHECK ARRAY IS SORETED OR NOT(Function)-----------------------------------------

    // public static  void sortedornot(int arr[]){
        
    //     int n =arr.length;
    //     boolean sortasc = true;
    //     boolean sortdesc = true;
    //     for(int i=0;i<n-1;i++){
    //         if(arr[i+1]>arr[i]){
    //             sortasc = false;
    //         }
    //     }

    //     for(int i=0;i<n-1;i++){

    //         if(arr[i]>arr[i+1]){
    //             sortdesc=false;
    //         }
    //     }
        
    //     if(sortasc==true || sortdesc ==true){

    //         System.out.println("yes");
    //     }
    //     else{
    //         System.out.println("no");
    //     }

    // }

    //-----------------------------------SECOND LARGEST ELEMENT FUNCTION(Naive Solution)--------------------
    
    // public static int secondlargest(int arr[],int largest){

    //     int lar = largest;
    //     int index = -1;
    //     int n = arr.length;

    //     for(int i=0;i<n;i++){
             
    //         if(arr[i]!=arr[lar]){

    //             if(index==-1){
    //                 index=i;
    //             }

    //             else if(arr[i]>arr[index]){
    //                 index=i;

    //             }
    //         }
           
    //     }

    //     return index;
    // }

    //-----------------------------------SECOND LARGEST ELEMENT FUNCTION(Efficient Solution) FUNCTION--------------------
    

    // important thing to do this code is res intially -1 and largest =0 and then move forward apply 
    //those conditions and update result according to that

    
    // public static int secondlargest(int arr[]){

    //     int n = arr.length;

    //     int res =-1; int largest =0;

    //     for(int i=1;i<n;i++){

    //         if(arr[i]>arr[largest]){

    //             res =largest;
    //             largest=i;
    //         }

    //         else if(arr[largest]>arr[i]){

    //             if(res==-1){
    //                 res=i;
    //             }
    //             else if(arr[i]>arr[res]){
    //                 res = i;
    //             }
    //         }
    //     }

    //     return res;
    // }


    //--------------------------------------------------REVERSE ARRAY FUNCTION------------------------------------------


    // public static int [] reversearr(int arr[]){

    //     int n = arr.length;

    //     int low = 0;
    //     int high = n-1;

    //     while(low<=high){

    //         int temp = arr[low];
    //         arr[low]=arr[high];

    //         arr[high]=temp;

    //         low++;
    //         high--;

    //     }

    //     return arr;

    // }





   //---------------------------------------REMOVE DUPLICATES FROM AN ARRAY(FUNCTION)Naive-------------------------------------------------

   
    //    public static int removeduplicates(int arr[]){

    //        int n = arr.length;

    //        int temp[]=new int[n];

    //        temp[0]=arr[0];

    //        int res =1;

    //        for(int i=1; i<n;i++){

    //            if(arr[i]!=temp[res-1]){

    //                temp[res]=arr[i];

    //                res++;

    //            }
    //        }

    //        for(int i=0;i<res;i++){

    //            arr[i]=temp[i];
    //        }


    //        return res;
    //   }




   //---------------------------------------REMOVE DUPLICATES FROM AN ARRAY(FUNCTION)Effiecint-------------------------------------------------

//    static int remDups(int arr[], int n)
//    {
//        int res = 1;

//        for(int i = 1; i < n; i++)
//        {
//            if(arr[res - 1] != arr[i])
//            {
//                arr[res] = arr[i];
//                res++;
//            }
//        }

//        return res;
//    }


//------------------------------------------------------------------------------------------------------------------------------------------


//----------------------------------------------LEFT ROTATE AN ARRAY BY D PLACES-----------------------------------------------------------

// public static void movbyd(int arr[],int n,int d){

//     int temp[]=new int[n];

//     for(int i=0;i<d;i++){
//         temp[i]=arr[i];
//     }

//     for(int i=d;i<n;i++){

//         arr[i-d]=arr[i];
//     }

//     for(int i=0;i<d;i++){

//         arr[n-d+i]=temp[i];
//     }


//     //------final array---------

//     for(int i=0;i<n;i++){

//         System.out.print(arr[i]+" ");
//     }

    
// }



//----------------------------------------------------------LEFT ROTATE AN ARRAY BY RECURSIVE--------------------------------------------------------

    // public static void reverse(int arr[],int low,int high){


    //     while(low<=high){

    //         int temp = arr[low];
    //         arr[low]=arr[high];
    //         arr[high]=temp;
    //         low++;
    //         high--;
    //     }
    // }
    




    // public static void leftrotate(int arr[],int n, int d){

    //     reverse(arr,0,d-1);
    //     reverse(arr,d,n-1);
    //     reverse(arr,0,n-1);

    //     for(int i=0;i<n;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }


    //-------------------------------------------------------MOVE ALL ZEROES TO END(NAIVE)FUNCTION---------------------------------------------------

    //   public static void movezeros(int arr[],int n){

    //     for(int i=0;i<n;i++){

    //         if(arr[i]==0){

    //             for(int j=i+1;j<n;j++){

    //                 if(arr[j]!=0){

    //                     int temp = arr[i];
    //                     arr[i]=arr[j];
    //                     arr[j]=temp;
    //                 }
    //             }
    //         }
    //     }

    //     for(int i=0;i<n;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //   }


    //-------------------------------------------------------MOVE ALL ZEROES TO END(Efficient)FUNCTION---------------------------------------------------


       public static void movezeros(int arr[],int n){
            
           int count=0;

           for(int i=0;i<n;i++){
               if(arr[i]!=0){
                    int temp = arr[i];
                    arr[i]=arr[count];
                    arr[count]=temp;
                    count++;

               }
           }

           for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }


       }



    public static void main(String[]args){

        //---------------------------GREATEST ELEMENT IN AN ARRAY---------------------------------------

        // int arr[]={10,5,20,8}; //output: 2

        // int arr[]={40,8,50,100}; // output: 3

        // int max = greatestelement(arr);

        // System.out.println(max);

        //-----------------------------------------------------------------------------------------------


        //--------------------------CHECK ARRAY IS SORETED OR NOT-----------------------------------------


        // int arr[]={10,20,30}; output: yes

        // int arr[]={30,20,10}; output: yes

        // int arr[]={40,20,30};  output: no

        // int arr[]={10,10,10};  output: yes

        // sortedornot(arr);



        //--------------------------------SECOND LARGEST ELEMENT(Naive Solution)----------------------------------------------

        // int arr[] ={40,30,10,20};

        // int largest = greatestelement(arr);
        
        // int max = secondlargest(arr,largest);

        // System.out.println(max);


        //--------------------------------SECOND LARGEST ELEMENT(EFFICIENT SOLUTION)-------------------------------------------

        // int arr[]={8,10,13,12,8,12,7,9,11,11};

        // int secondlargeindex = secondlargest(arr);

        // System.out.println(secondlargeindex);






        //------------------------------------REVERSE AN ARRAY--------------------------------------------------------------

        // int arr[]={10,20,30,40,50};

        // int revarr[]=reversearr(arr);

        // int m=revarr.length;

        // for(int i=0;i<m;i++){

        //     System.out.print(revarr[i]+" ");
        // }


       
       
       
       
        //---------------------------------------REMOVE DUPLICATES FROM AN ARRAY(Naive approach)-------------------------------------------------

        // int arr[]={10,20,20,30,30,30};

        // int n = removeduplicates(arr);

        // System.out.println(n);

        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]);
        // }

        //------------------------------------------REMOVE DUPLICATES FROM AN ARRAY(Efficient approach)---------------------------------------


        
        // int arr[] = {10, 20, 20, 30, 30, 30}, n = 6;

        // System.out.println("Before Removal");
 
        // for(int i = 0; i < n; i++)
        // {
        //         System.out.print(arr[i]+" ");
        // }
 
        // System.out.println();
 
        // n = remDups(arr, n);
 
        // System.out.println("After Removal");
 
        // for(int i = 0; i < n; i++)
        // {
        //         System.out.print(arr[i]+" ");
        // }



        //---------------------------------------------------LEFT ROTATE AN ARRAY BY 1 PLACE-----------------------------------------------------


    //     int arr[]={1,2,3,4,5};

    //     int n = 5;

    //     int temp = arr[0];

    //     for(int i=1;i<n;i++){
    //         arr[i-1]=arr[i];
    //     }

    //     arr[n-1]=temp;

    //    for(int i=0;i<n;i++){
    //     System.out.print(arr[i]+" ");
    //    }


    //-------------------------------------------------LEFT ROTATE AN ARRAY BY D PLACES------------------------------------------------

    //   int arr[]={1,2,3,4,5};
    //   int n =5;
    //   int d =2;

    //   movbyd(arr,n,d);

    //---------------------------------------------------LEFT ROTATE AN ARRAY BY D PLACES(RecursiveApproach)------------------------------------------------
    

    //    int arr[]={1,2,3,4,5};

    //    int d=2; int n=5;

    //    leftrotate(arr,n,d);




    //----------------------------------------------------MOVE ALL ZEROES TO END(NAIVE APPROACH)-----------------------------------------------

        // int arr[]={8,5,0,10,0,20};
        // int n = 6;
        // movezeros(arr,n);



    //----------------------------------------------------MOVE ALL ZEROES TO END(efficient APPROACH)-------------------------------------------    

        int arr[]={8,5,0,10,0,20};
        int n = 6;
        movezeros(arr,n);

        
       


    }
}







//-----------------------------------------***********END HERE*************------------------------------------------------------------------------
