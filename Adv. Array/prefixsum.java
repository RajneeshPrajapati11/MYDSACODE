public class prefixsum {
    
    //________________________________________________Naive Solution_________________________________________________________________________
    
    // static int getsum(int arr[],int l,int r){

    //     int res=0;

    //     for(int i=l;i<=r;i++){
    //         res = res+arr[i];
    //     }

    //     return res;
    // }
    
   
    //__________________________________________Efficient solution- preprocessing in o(n)and query answer in o(1)________________________________

    static int getsum(int arr[],int l,int r){
        int n = arr.length;
        int ps[]=new int[n];

        ps[0]=arr[0];

        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+arr[i];


        }

        if(l==0){
            return ps[r];
        }

        return ps[r]-ps[l-1];
    }

    public static void main(String[]args){

        int arr[]={2,8,3,9,6,5,4};
        int l=1;int r =3;
       System.out.println( getsum(arr,l,r));
    }

}
