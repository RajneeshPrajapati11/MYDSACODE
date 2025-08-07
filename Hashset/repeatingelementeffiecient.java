import java.util.HashSet;

public class repeatingelementeffiecient {
    public static void printDistinct(int arr[]){
        HashSet<Integer>s = new HashSet<>();
          
        for(int i=0;i<arr.length;i++){

            if(s.contains(arr[i])==true){
               
                System.out.println(arr[i]+" ");
                
                

            }
            else{
                s.add(arr[i]);
            }
        }


    }
    public static void main(String[]args){
        
        int []arr= {10,8,10,8};

        printDistinct(arr);
       
    }
}
