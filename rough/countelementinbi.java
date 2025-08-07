public class countelementinbi {
    
    public static void main(String[]args){

        int arr[]={2,4,10,10,10,18,20};
        int key =10;

        int k=0;
        int l=arr.length-1;
        int first=0;

        while(k<=l){
            
            int mid1=k+l-k/2;

            if(key==arr[mid1]){
                first=mid1;
                l=mid1-1;
            }
            else if(key<arr[mid1]){
                l=mid1-1;
            }
            else{
                k=mid1+1;
            }
        }

        int i=0;
        int j=arr.length-1;
        int second=0;
        while(i<=j){
            int mid2=i+j-i/2;

            if(key==arr[mid2]){
                second=mid2;
                i=mid2+1;
            }
            else if(key<arr[mid2]){
                j=mid2-1;
            }
            else{
                i=mid2+1;
            }
        }

        System.out.print(second-first+1);
    }
}
