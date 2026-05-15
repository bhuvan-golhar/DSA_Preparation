// Problem: Check if String is Palindrome
// Approach: Two Pointer Comparison
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}