public class naivepartQuicksort {
    
    static void partition(int arr[],int low,int high,int p){
            
        int temp[]=new int[high-low+1];
        int index=0;
        for(int i=low;i<=high;i++){

            if(arr[i]<=arr[p]&&i!=p){
                temp[index]=arr[i];
                index++;
            }
        }
        temp[index++]=arr[p];


        for(int i=low;i<=high;i++){

            if(arr[i]>arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }

        for(int i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }

        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[]args){

        int arr[]={5,13,6,9,12,11,8};

        int n=arr.length;
        int p=6;
        int low=0;
        int high=n-1;

        partition(arr,low,high,p);

    }
}
