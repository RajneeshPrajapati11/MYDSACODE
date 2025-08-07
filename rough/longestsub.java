public class longestsub {
    public static void main(String[] args) {

        int arr[] = {4, 1, 1, 1, 2, 3, 5};  // input array
        int given_sum = 5;                 // target sum
        int maximum = 0;                   // holds the max length of subarray with sum = given_sum

        int i = 0;                         // start of window
        int j = 0;                         // end of window
        int sum = 0;                       // current window sum

        while (j < arr.length) {
            sum = sum + arr[j];           // add current element to window sum

            // Case 1: If window sum < target, just expand window
            if (sum < given_sum) {
                j++;
            }

            // Case 2: If window sum == target, record length and expand window
            else if (sum == given_sum) {
                maximum = Math.max(maximum, (j - i + 1));  // update max length
                j++;  // expand window
            }

            // Case 3: If sum > target, shrink window from left
            else if (sum > given_sum) {
                while (sum > given_sum && i <= j) {
                    sum = sum - arr[i];  // remove leftmost element
                    i++;                // move left end of window
                }

                // After shrinking, check if it became equal
                if (sum == given_sum) {
                    maximum = Math.max(maximum, (j - i + 1));
                }

                j++;  // always move right end after adjustments
            }
        }

        System.out.println(maximum);  // print result
    }
}
