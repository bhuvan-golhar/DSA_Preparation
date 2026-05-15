// Problem: Find Longest Substring Without Repeating Characters
// Approach: Sliding Window with Character Tracking
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int longestUniqueSubstring(String str) {

        boolean[] seen = new boolean[256];

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < str.length(); right++) {

            while (seen[str.charAt(right)]) {
                seen[str.charAt(left)] = false;
                left++;
            }

            seen[str.charAt(right)] = true;

            int windowLength = right - left + 1;

            if (windowLength > maxLength) {
                maxLength = windowLength;
            }
        }

        return maxLength;
    }
}