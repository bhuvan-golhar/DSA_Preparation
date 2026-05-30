// Problem: Check Perfect Number
// Approach: Divisor Summation
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean isPerfectNumber(int n) {

        int sum = 0;

        for (int i = 1; i < n; i++) {

            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }
}