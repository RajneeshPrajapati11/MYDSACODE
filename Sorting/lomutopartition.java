public class lomutopartition {
    
    static void lpartition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp2=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp2;



        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    
    
    
    
    
    public static void main(String[]args){

        int arr[]={10,80,30,90,40,50,70};
        int n=arr.length;
        int low=0;
        int high=n-1;

        lpartition(arr,low,high);
    }
}
