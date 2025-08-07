

class binaryiterative{

    static int bsearch(int arr[],int x){
        int n=arr.length;

        int low=0;
        int high=n-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]>x){
                high=mid-1;
            }
            if(arr[mid]<x){
                low=mid+1;
            }
    
        }
        return -1;
    }
    
    
    
    public static void main(String[]args){
        
        int arr[]={10,20,30,40,50,60,70};
        int x=60;

        System.out.println(bsearch(arr,x));
    }
}