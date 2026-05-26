// Problem: Find Minimum Window Substring
// Approach: Sliding Window with Frequency Tracking
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public String minWindow(String str, String target) {

        if (str.length() == 0 || target.length() == 0) {
            return "";
        }

        int[] freq = new int[128];

        for (int i = 0; i < target.length(); i++) {
            freq[target.charAt(i)]++;
        }

        int left = 0;
        int matched = 0;

        int minLength = Integer.MAX_VALUE;
        int startIndex = 0;

        for (int right = 0; right < str.length(); right++) {

            char current = str.charAt(right);

            if (freq[current] > 0) {
                matched++;
            }

            freq[current]--;

            while (matched == target.length()) {

                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    startIndex = left;
                }

                char leftChar = str.charAt(left);

                freq[leftChar]++;

                if (freq[leftChar] > 0) {
                    matched--;
                }

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return str.substring(startIndex, startIndex + minLength);
    }
}