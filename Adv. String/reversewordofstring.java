public class reversewordofstring {

    // Function to reverse characters from index low to high
    static void reverse(char[] str, int low, int high) {
        while (low < high) {
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;

            low++;
            high--;
        }
    }

    // Function to reverse each word and then reverse the entire string
    static void reversewords(char[] str, int n) {
        int start = 0;

        for (int end = 0; end < n; end++) {
            if (str[end] == ' ') {
                reverse(str, start, end - 1);
                start = end + 1;
            }
        }

        // Reverse the last word
        reverse(str, start, n - 1);

        // Reverse the whole string
        reverse(str, 0, n - 1);
    }

    public static void main(String[] args) {
        String s = "welcome to gfg";
        int n = s.length();
        char[] str = s.toCharArray();

        System.out.println("After reversing words in the string:");

        reversewords(str, n);

        System.out.println(str);
    }
}
