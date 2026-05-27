// Problem: Check Palindrome Number
// Approach: Reverse Number Comparison
// Time Complexity: O(d)
// Space Complexity: O(1)

class Solution {
    public boolean isPalindrome(int n) {

        int original = n;
        int reversed = 0;

        while (n > 0) {

            int digit = n % 10;
            reversed = reversed * 10 + digit;

            n /= 10;
        }

        return original == reversed;
    }
}