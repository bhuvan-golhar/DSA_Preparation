// Problem: Check if a Number is Prime
// Approach: Divisibility Checking
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
