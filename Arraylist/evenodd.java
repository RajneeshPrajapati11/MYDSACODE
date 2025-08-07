import java.util.*;

class B{
     public static void getevenodd(int arr[]){
        ArrayList<Integer>even = new ArrayList<>();

        ArrayList<Integer>odd = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }

        }
        System.out.println("even no.s");
        for(int num:even){
            System.out.println(num);
        }
        System.out.println("odd no.s");
        for(int num:odd){
            System.out.println(num);
        }
     }
}


public class evenodd {
    public static void main(String[]args){
        
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int []arr = new int[n];

        for(int i=0;i<arr.length;i++){

            arr[i]= s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

        }
        System.out.println(" ");
        B myob = new B();
        myob.getevenodd(arr);

    }
}
