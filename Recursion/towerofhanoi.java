public class towerofhanoi {
    
    static void TOH(int n, char source, char auxiliary, char destination) {

        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        TOH(n - 1, source, destination, auxiliary);              // Step 1
        System.out.println("Move disk " + n + " from " + source + " to " + destination);  // Step 2
        TOH(n - 1, auxiliary, source, destination);              // Step 3
    }

    public static void main(String[] args) {
        int n = 3;
        TOH(n, 'A', 'B', 'C');
    }
}
