class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Queue {
    Node front, rear;
    int size;

    Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    void enqueue(int x) {
        Node temp = new Node(x);
        if (front == null) {
            front = rear = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    int getFront() {
        if (front != null) return front.data;
        return -1;
    }

    int getRear() {
        if (rear != null) return rear.data;
        return -1;
    }
}

//driver method
public class queueimplementusinglink {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();

        System.out.println("Queue Front : " + q.getFront());
        System.out.println("Queue Rear : " + q.getRear());
    }
}
