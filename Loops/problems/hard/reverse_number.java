// Problem: Reverse a Number
// Approach: Digit Reconstruction
// Time Complexity: O(d)
// Space Complexity: O(1)

class Solution {
    public int reverseNumber(int n) {

        int reversed = 0;

        while (n > 0) {

            int digit = n % 10;
            reversed = reversed * 10 + digit;

            n /= 10;
        }

        return reversed;
    }
}