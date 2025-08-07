import java.util.*;

public class countanagram {

    public static void main(String[] args) {

        String s = "aabaabaa";    // Input string in which we want to count anagram substrings
        String pat = "aaba";      // Pattern whose anagrams we are looking for in 's'

        // Step 1: Create a frequency map (character count) for the pattern string
        HashMap<Character, Integer> h = new HashMap<>();
        for (char c : pat.toCharArray()) {
            h.put(c, h.getOrDefault(c, 0) + 1); // Count each character in the pattern
        }

        int count = h.size();     // This keeps track of how many unique characters still need to match completely
        int i = 0, j = 0;         // i is the start of the window, j is the end
        int k = pat.length();     // Window size is equal to the length of the pattern
        int ans = 0;              // This will hold the total number of anagram matches found

        // Step 2: Start sliding the window over the input string 's'
        while (j < s.length()) {

            // Step 2a: Process the current character at window's right end
            char ch = s.charAt(j);
            if (h.containsKey(ch)) {
                // If the character exists in the pattern, reduce its count in the map
                h.put(ch, h.get(ch) - 1);

                // If the count becomes zero, it means we've matched all required instances of this character
                if (h.get(ch) == 0) {
                    count--; // One less character to match fully
                }
            }

            // Step 2b: If window size is smaller than k, expand the window by moving 'j' forward
            if ((j - i + 1) < k) {
                j++;
            }

            // Step 3: If window size equals the size of the pattern,
            else if ((j - i + 1) == k) {

                // If count is zero, it means all characters matched => we found an anagram
                if (count == 0) {
                    ans++;
                }

                // Step 3a: Before moving the window forward, restore the left character
                // (because it's leaving the window now)
                char chLeft = s.charAt(i);
                if (h.containsKey(chLeft)) {
                    // We increase the count in the map for this character
                    h.put(chLeft, h.get(chLeft) + 1);

                    // If its count goes from 0 to 1, it means we just un-matched a full match,
                    // so we need to increase 'count' back
                    if (h.get(chLeft) == 1) {
                        count++;
                    }
                }

                // Slide the window forward: move both pointers
                i++;
                j++;
            }
        }

        // Step 4: Output the final result
        System.out.println("Number of anagram substrings: " + ans);
    }
}
