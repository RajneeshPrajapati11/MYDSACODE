public class insertatbegin {

    // Definition of a Node in the linked list
    static class Node {
        int data;     // Value of the node
        Node next;    // Reference to the next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to insert a new node at the beginning of the list
    static Node insertBegin(Node head, int x) {
        // Create a new node with given data
        Node newNode = new Node(x);

        // Make next of new node point to current head
        newNode.next = head;

        // New node becomes the new head of the list
        return newNode;
    }

    // Utility function to print the linked list
    static void printList(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("null"); // End of list
    }

    // Driver code
    public static void main(String[] args) {
        Node head = null; // Start with an empty list

        // Insert nodes at the beginning
        head = insertBegin(head, 30);
        head = insertBegin(head, 20);
        head = insertBegin(head, 10);

        // Print the linked list
        printList(head); // Expected Output: 10 -> 20 -> 30 -> null
    }
}
