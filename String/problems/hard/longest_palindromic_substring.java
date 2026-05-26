// Problem: Find Longest Palindromic Substring
// Approach: Expand Around Center
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution {
    public String longestPalindrome(String str) {

        if (str == null || str.length() < 1) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < str.length(); i++) {

            int len1 = expandFromCenter(str, i, i);
            int len2 = expandFromCenter(str, i, i + 1);

            int maxLen = Math.max(len1, len2);

            if (maxLen > end - start) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }

        return str.substring(start, end + 1);
    }

    private int expandFromCenter(String str, int left, int right) {

        while (left >= 0 &&
               right < str.length() &&
               str.charAt(left) == str.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }
}