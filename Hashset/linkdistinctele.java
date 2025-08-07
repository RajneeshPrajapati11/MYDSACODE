import java.util.*;



public class linkdistinctele {
    
    
    public static void linkedHashsetdistinct(int arr[],int n){

        LinkedHashSet<Integer>li = new LinkedHashSet<>();

        for(int x : arr){
            li.add(x);
        }

        System.out.println(li);

    }
    
    
    
    
    
    
    
    
    public static void main(String[]args){
        int n=5;
        
        int []arr={30,20,20,25,30};

        linkedHashsetdistinct(arr,n);
    }
    
    
    
    
    
    
}
