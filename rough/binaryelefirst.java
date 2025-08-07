public class binaryelefirst {
    public static void main(String[]args){

        int arr[] ={2,4,10,10,10,18,20};
        int res=-1;

        int start=0;
        int end=arr.length-1;

        int key=10;//iski pahali occurence batani hai

        while(start<=end){

            int mid = start+(end-start)/2;

            if(key==arr[mid]){

                res=mid;
                end=mid-1;//for first occurence
                //start=mid+1 for last occurence

            }
            
            else if(key<arr[mid]){
                end=mid-1;
            }
            
            else{
                start=mid+1;
            }

        }
        System.out.print(res);
    }
}
