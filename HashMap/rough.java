import java.util.PriorityQueue;

public class rough {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num); // Add to heap
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element
            }
        }

        System.out.println("K-th largest element: " + minHeap.peek());
    }
}
