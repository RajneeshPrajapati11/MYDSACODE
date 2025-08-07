import java.util.*;

public class stackmiddel3 {

    public static Stack<Integer> removeMiddle(Stack<Integer> s) {
        int k = s.size() / 2 + 1;
        solve(s, k);
        return s;
    }

    private static void solve(Stack<Integer> s, int k) {
        if (k == 1) {
            s.pop();  //Middle element removed here
            return;
        }

        int temp = s.pop();      // Save top
        solve(s, k - 1);         // Go deeper
        s.push(temp);            // Push back after recursion
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }

        s = removeMiddle(s);
        System.out.println("Stack after removing middle: " + s);
    }
}
