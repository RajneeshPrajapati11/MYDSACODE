public class traprainwater {
    
    // static int trapwater(int arr[]){
    //     int n = arr.length;

    //     int res =0;

    //     for(int i=1;i<n-1;i++){// kyoki paani bich mai bhara jaayega agr sorted order mai hai array toh nahi bhar skte
            
    //         int left_max = arr[i];

    //         for(int j=0;j<i;j++){

    //             left_max=Math.max(left_max, arr[j]);
    //         }

    //         int right_max = arr[i];

    //         for(int j=i+1;j<n;j++){

    //             right_max=Math.max(right_max,arr[j]);
    //         }

    //         res = res+(Math.min(right_max,left_max)-arr[i]);
    //     }

    //     return res;
    // }


    //-----------------------------------------------------Efficient solution---------------------------------------------------------------------

    static int trapwater(int arr[]){

        int n = arr.length;

        int lmax[]=new int[n];
        int rmax[]=new int[n];

        int res = 0;

        lmax[0]=arr[0];
        
        for(int i=1;i<n;i++){

            lmax[i]=Math.max(arr[i],lmax[i-1]);
        }


        rmax[n-1]=arr[n-1];

        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(arr[i], rmax[i+1]);
        }


        for(int i=1;i<n-1;i++){

            res = res+(Math.min(lmax[i],rmax[i])-arr[i]);
        }

        return res;


    }
    
    
    
    
    
    public static void main(String[]args){

        int arr[]={3,0,1,2,5};

       int kitnapaani= trapwater(arr);

       System.out.println("kitna paani fasa: "+kitnapaani);
    }
}
