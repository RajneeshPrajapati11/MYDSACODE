public class hoarepartition {

    static int hpartition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;

        while (true) {
            // Move i to the right
            do {
                i++;
            } while (arr[i] < pivot);

            // Move j to the left
            do {
                j--;
            } while (arr[j] > pivot);

            // If pointers meet or cross
            if (i >= j)
                return j;

            // Swap elements at i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 4, 2, 7, 1, 10};
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        int partitionIndex = hpartition(arr, low, high);
        System.out.println("Partition index: " + partitionIndex);

        // Print the array after partition
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
