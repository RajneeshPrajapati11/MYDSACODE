import java.util.*;

public class stackNGE{
    public static void main(String[] args){
        int[] a = {10, 9, 11,12,9,8};
        int [] output = new int[a.length];
        Arrays.fill(output,-1);
        Stack<Integer> st = new Stack<>();
        for(int i =0; i<a.length;i++){
            while(!st.isEmpty() && a[i] > a[st.peek()]){
                int kaunBharAaya = st.pop();
                output[kaunBharAaya] = a[i];
            }
            st.push(i);
        }
        
        for(int i = 0; i<output.length;i++){
            System.out.println(output[i]);
        }

    }
}