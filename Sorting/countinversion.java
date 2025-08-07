public class countinversion {
    
    //---------------------------------------------------------Naive Solution-----------------------------------------------------------------
    
    // static int countInversion(int arr[]){

    //     int n=arr.length;
    //     int res=0;

    //     for(int i=0;i<(n-1);i++){
    //         for(int j=i+1;j<n;j++){
    //             if(arr[i]>arr[j]){
    //                 res++;
    //             }
    //         }
    //     }
    //     return res;
    // }

    //-------------------------------------------------------Efficient solution using merge sort by some changes-----------------------
    
    static int countInversion(int arr[],int l,int r){

        
        int res=0;
        
        if(l<r){
             
            int m=l+(r-l)/2;

            res=res+countInversion(arr,l,m);
            res=res+countInversion(arr,m+1,r);
            res=res+countAndMerge(arr,l,m,r);
        }
        return res;
    }

    // merge and sort function for calculating result

    static int countAndMerge(int arr[],int l,int m,int r){
          
        int n1=m-l+1;
        int n2=r-m;

        int left[]=new int[n1];
        int right[]=new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[m+1+i];
        }

        int res=0;//yeh alag hai ek tohh
        int i=0,j=0,k=l;

        while(i<n1&&j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }
            else{
                arr[k++] = right[j++];
                res += (n1 - i); //ek yeh alag
                
            }
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }

        return res;
    }



    public static void main(String[]args){

        int arr[]={2,4,1,3,5};
        int n=arr.length;
        int l=0;
        int r=n-1;


        int res = countInversion(arr,l,r);
        System.out.print(res);
    }
}
