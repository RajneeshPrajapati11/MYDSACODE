class Deque {
    int[] arr;
    int front, rear, size, capacity;

    Deque(int cap) {
        capacity = cap;
        arr = new int[capacity];
        front = -1;
        rear = 0;
        size = 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void insertFront(int x) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }

        // First element
        if (front == -1) {
            front = rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }

        arr[front] = x;
        size++;
    }

    void insertRear(int x) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }

        // First element
        if (front == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }

        arr[rear] = x;
        size++;
    }

    void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
    }

    void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        if (front == rear) {
            front = rear = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }
        size--;
    }

    int getFront() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    int getRear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }
}
public class DequeArrayTest {
    public static void main(String[] args) {
        Deque dq = new Deque(5);

        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.insertFront(3);

        System.out.println("Front element: " + dq.getFront()); // 3
        System.out.println("Rear element: " + dq.getRear());   // 20

        dq.deleteFront(); // removes 3
        dq.deleteRear();  // removes 20

        System.out.println("After deletion:");
        System.out.println("Front element: " + dq.getFront()); // 5
        System.out.println("Rear element: " + dq.getRear());   // 10
    }
}
