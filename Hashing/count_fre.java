import java.util.*;

public class count_fre {

    static void fre_elem(int arr[]){

        //---------------------------Naive Solution----------------------------------------------------------------
        
        // for(int i=0;i<arr.length;i++){

        //     boolean flag = false;

        //     for(int j=0;j<i;j++){
                
        //         if(arr[i]==arr[j]){
        //             flag = true;
        //             break;
        //         }
        //     }

        //     if(flag==true){
        //         continue;
        //     }

        //     int frq =1;

        //     for(int j=i+1;j<arr.length;j++ ){

        //         if(arr[i]==arr[j]){
        //             frq++;
        //         }
        //     }

        //     System.out.println("the frequency of element "+arr[i]+" is "+ frq);

        // }

        //------------------------------------Efficient Solution-------------------------------------------------------

        HashMap<Integer,Integer> h = new HashMap<>();
        for(int x:arr){
            h.put(x,h.getOrDefault(x,0)+1);


        }

        for(Map.Entry<Integer,Integer>e:h.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
    public static void main(String[]args){

        int arr[]={10,20,10,30,40,40,40};

        fre_elem(arr);

      
    }
}
