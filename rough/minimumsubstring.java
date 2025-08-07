import java.util.*;

public class minimumsubstring {
    public static void main(String[] args) {

        // Input string and pattern
        String s = "totmtaptat";
        String pat = "tta";

        // Step 1: Create frequency map for characters in the pattern
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : pat.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = map.size(); // Number of unique characters to match
        int min = Integer.MAX_VALUE; // To store minimum length
        String result = ""; // To store final answer substring

        int i = 0; // Start of sliding window
        int j = 0; // End of sliding window

        // Step 2: Start traversing the string with sliding window
        while (j < s.length()) {

            char rightChar = s.charAt(j);

            // Decrease frequency in map if current char is part of the pattern
            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.get(rightChar) - 1);

                // When character frequency becomes zero, reduce 'count'
                if (map.get(rightChar) == 0) {
                    count--;
                }
            }

            // Step 3: When a valid window is found (all pattern chars matched)
            while (count == 0) {
                // Check if current window is smaller than previously found minimum
                if ((j - i + 1) < min) {
                    min = j - i + 1;
                    result = s.substring(i, j + 1);
                }

                // Try to shrink the window from the left
                char leftChar = s.charAt(i);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);

                    // If frequency becomes positive, window is no longer valid
                    if (map.get(leftChar) > 0) {
                        count++;
                    }
                }

                i++; // Move left pointer forward
            }

            j++; // Move right pointer forward
        }

        // Step 4: Print result
        System.out.println("Minimum length: " + min);
        System.out.println("Minimum window substring: " + result);
    }
}
