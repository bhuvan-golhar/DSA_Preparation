// Problem: Find First Non-Repeating Character
// Approach: Frequency Counting
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public char firstNonRepeatingChar(String str) {

        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i) - 'a'] == 1) {
                return str.charAt(i);
            }
        }

        return '\0';
    }
}