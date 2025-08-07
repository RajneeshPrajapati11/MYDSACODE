public class majorityelement {
    //_________________________________________Naive solution_______________________________________________________________________
    // static int find_majority_ele_index(int arr[],int n){

    //     for(int i=0;i<n;i++){

    //         int count =1;

    //         for(int j=i+1;j<n;j++){

    //             if(arr[i]==arr[j]){
    //                 count++;
    //             }
    //         }

    //         if(count>n/2){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }


    //_____________________________________________________________Efficient Solution____________________________________________________________

    //there are two phases of code here -- ist phase yeh check krega ki kon banskata hai major element and second check krega ki wo major haiki nahi.
    
    static int find_majority_ele_index(int arr[],int n){

        int res=0;int count=1;
        for(int i=1;i<n;i++){

            if(arr[res]==arr[i]){
                count++;
            }
            else{
                count--;
            }

            if(count==0){
                res=i;
                count=1;
            }
        }


        count=0;
        for(int i=0;i<n;i++){
            if(arr[res]==arr[i]){
                count++;
            }
            
        }
        if(count<=n/2){
            return -1;
        }
        return res;
    }
//--------------------------------------------------------------------------------------------------------------------------------------

//_____________________________________________________main function_________________________________________________________________


    public static void main(String []args){

        int arr[]={8,3,4,8,8};
        int n =5;

        int m = find_majority_ele_index(arr,n);

        System.out.println("majority element index:"+m);
    }
}
