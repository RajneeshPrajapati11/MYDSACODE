// import java.util.*;

// public class maximumofallsub {
    
//     public static void main(String[]args){

//         int arr[]={3,2,1,5};

//         int i=0;
//         int j=0;
//         int k=3;
//         int maximum=Integer.MIN_VALUE;
        
//         List<Integer>li=new ArrayList<>();
//         Deque<Integer>de=new LinkedList<>();
        
//         while(j<arr.length){

//             //calculation part

//             maximum = Math.max(maximum,arr[j]);

//             if((j-i+1)<k){
//                 j++;
//             }

//             else if((j-i+1)==k){

//                 li.add(maximum);
                
//                 if(arr[i]==maximum){
//                     maximum = Integer.MIN_VALUE;
//                 }

//                 i++;
//                 j++;
//             }
//         }

//         System.out.print(li+" ");
//     }
// }

import java.util.*;

public class maximumofallsub {
    
    public static void main(String[] args) {

        int arr[] = {3, 2, 1, 5};
        int k = 3; // Size of the sliding window

        Deque<Integer> dq = new LinkedList<>(); // Stores indices of useful elements for each window
        List<Integer> li = new ArrayList<>();   // Stores final maximums for each window

        int i = 0; // Start of window
        int j = 0; // End of window

        while (j < arr.length) {

            // -------- Step 1: Remove smaller elements from back --------
            // Maintain decreasing order in deque
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[j]) {
                dq.pollLast(); // Pop from back if current element is greater
            }

            // -------- Step 2: Add current element index at the back --------
            dq.offerLast(j); // Insert current index at the back of deque

            // -------- Step 3: Check if window size is less than k --------
            if ((j - i + 1) < k) {
                j++; // Expand the window to size k
            }

            // -------- Step 4: Window size exactly k --------
            else if ((j - i + 1) == k) {

                // The element at the front of deque is the largest in current window
                li.add(arr[dq.peekFirst()]);

                // -------- Step 5: Slide the window --------
                // Remove the element going out of the window if it's at the front of deque
                if (dq.peekFirst() == i) {
                    dq.pollFirst(); // Remove the front index
                }

                // Slide the window forward
                i++;
                j++;
            }
        }

        System.out.print(li + " ");
    }
}
