// Problem: Find Factorial of a Number
// Approach: Multiplicative Accumulation
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int findFactorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}
