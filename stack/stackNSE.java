import java.util.*;

public class stackNSE{
    public static void main(String[] args){
        int[] a = {10, 9, 11,12,9,8};
        int [] output = new int[a.length];
        Arrays.fill(output,-1);
        Stack<Integer> st = new Stack<>();
        for(int i = a.length-1; i>=0;i--){
            while(!st.isEmpty() && a[i] < a[st.peek()]){
                int kaunBharAaya = st.pop();
                output[kaunBharAaya] = a[i];
            }
            st.push(i);
        }
        
        for(int i = 0; i<output.length;i++){
            System.out.print(output[i]+" ");
        }

    }
}