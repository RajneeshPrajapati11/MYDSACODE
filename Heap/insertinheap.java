public class insertinheap {

    static class minheap {
        int[] arr;
        int size;
        int capacity;

        minheap(int c) {
            arr = new int[c];
            size = 0;
            capacity = c;
        }

        int left(int i) {
            return (2 * i + 1);
        }

        int right(int i) {
            return (2 * i + 2);
        }

        int parent(int i) {
            return (i - 1) / 2;
        }

        // inside minheap class
        public void insert(int x) {
            if (size == capacity) {
                System.out.println("Heap is full!");
                return;
            }

            size++;
            int i = size - 1;
            arr[i] = x;

            // Percolate up
            while (i != 0 && arr[parent(i)] > arr[i]) {
                // Swap with parent
                int temp = arr[i];
                arr[i] = arr[parent(i)];
                arr[parent(i)] = temp;

                i = parent(i);
            }
        }

        
        public void printHeap() {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        minheap h = new minheap(11);
        h.insert(3);
        h.insert(2);
        h.insert(15);
        h.insert(20);
        h.printHeap();  // Output: 2 3 15 20
    }
}
