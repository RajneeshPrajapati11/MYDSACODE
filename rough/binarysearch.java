public class binarysearch {
    public static void main(String[]args){

        int arr[]={1,2,3,4,5,6,7,8};

        int key=2;

        int start=0;
        int end=arr.length;

        while(start<=end){
             
            int mid=(end-start)/2;

            if(arr[mid]==key){
                System.out.println(mid);
            }

            else if(arr[mid]<key){
                start=mid+1;
            }
            else if(arr[mid]>key){
                mid=end-1;
            }
            
            start++;
            end--;

        }
    }
}
