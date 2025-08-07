public class freq_of_element {
    
    static void count_freq(int arr[]){
        int n = arr.length;

        int freq = 1;

        int i =1;

        while(i<n){

            while(i<n&&arr[i]==arr[i-1]){
                freq++;
                i++;
            }

            System.out.println(arr[i-1]+" "+freq);

            i++;

            freq=1;
        }

        if(i==n||arr[n-2]!=arr[n-1]){
            System.out.println(arr[n-1]+" "+freq);
        }
        
    }
    
    
    
    
    
    public static void main(String[]args){
        
        int arr[]={10,10,10,25,30};

        count_freq(arr);
    }
}
