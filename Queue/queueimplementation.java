//--------------------------------------------------------Naive and simple implementation-------------------------------------------------------
// class Queue {
//     int size, cap;
//     int arr[];

//     Queue(int c) {
//         cap = c;
//         size = 0;
//         arr = new int[cap];
//     }

//     boolean isfull() {
//         return (size == cap);
//     }

//     boolean isEmpty() {
//         return (size == 0);
//     }

//     void enqueue(int x) {
//         if (isfull()) {
//             System.out.println("Queue is full");
//             return;
//         }
//         arr[size] = x;
//         size++;
//     }

//     int dequeue() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty");
//             return -1;
//         }
//         int removed = arr[0];
//         for (int i = 0; i < size - 1; i++) {
//             arr[i] = arr[i + 1];
//         }
//         size--;
//         return removed;
//     }

//     int getfront() {
//         if (isEmpty()) {
//             return -1;
//         } else {
//             return arr[0];
//         }
//     }

//     int getRear() {
//         if (isEmpty()) {
//             return -1;
//         } else {
//             return arr[size - 1];
//         }
//     }
// }

//---------------------------------------------------------------------Efficient implementation-using circular array------------------------------------

class Queue {
    int front, size, cap;
    int arr[];

    Queue(int c) {
        cap = c;
        size = 0;
        front = 0;
        arr = new int[cap];
    }

    boolean isfull() {
        return (size == cap);
    }

    boolean isEmpty() {
        return (size == 0);
    }

    void enqueue(int x) {
        if (isfull()) {
            System.out.println("Queue is full");
            return;
        }
        int rear = (front + size) % cap;
        arr[rear] = x;
        size++;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = arr[front];
        front = (front + 1) % cap;
        size--;
        return removed;
    }

    int getfront() {
        if (isEmpty()) {
            return -1;
        } else {
            return arr[front];
        }
    }

    int getRear() {
        if (isEmpty()) {
            return -1;
        } else {
            int rear = (front + size - 1) % cap;
            return arr[rear];
        }
    }
}

public class queueimplementation {
    public static void main(String[] args) {
        Queue queue = new Queue(1000);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue() + " dequeued from queue\n");

        System.out.println("Front item is " + queue.getfront());

        System.out.println("Rear item is " + queue.getRear());
    }
}
