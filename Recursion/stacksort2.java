import java.util.*;

public class stacksort2 {

    // Recursive sort function
    public static Stack<Integer> sort(Stack<Integer> s) {
        if (s.size() == 1) {
            return s;
        }

        int temp = s.pop();  // remove top element
        s = sort(s);         // sort remaining stack

        s = insert(s, temp); // insert temp in sorted position
        return s;
    }

    // Recursive insert function
    public static Stack<Integer> insert(Stack<Integer> s, int temp) {
        if (s.size() == 0 || s.peek() <= temp) {
            s.push(temp);
            return s;
        }

        int last = s.pop();         // remove top
        s = insert(s, temp);        // insert recursively
        s.push(last);               // push the removed element back
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }

        s = sort(s);
        System.out.println("Sorted Stack: " + s);
        sc.close();
    }
}
