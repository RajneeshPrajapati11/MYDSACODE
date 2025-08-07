import java.util.*;

class B{
     public static void getsmaller(int arr[],int x){
        ArrayList<Integer>smallerelement = new ArrayList<>();

        for(int i=0;i<arr.length;i++){

            smallerelement.add(arr[i]);
        }
       
       Iterator it = smallerelement.iterator();

       while(it.hasNext()){
           
           int y = (Integer)it.next();
           
           if(y<x){
            System.out.println("the smaller element" +y);
           }
           
       }
        

        
       
     }
}


public class getsmaller {
    public static void main(String[]args){
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        System.out.println("Enter the value of x for which you want the smaller elements");
        int x = s.nextInt();
        int []arr = new int[n];

        for(int i=0;i<arr.length;i++){

            arr[i]= s.nextInt();
        }
        System.out.println("the elements of the array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

        }
        System.out.println(" ");
        B myob = new B();
        myob.getsmaller(arr,x);

    }
}

