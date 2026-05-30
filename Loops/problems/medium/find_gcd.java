// Problem: Find GCD of Two Numbers
// Approach: Divisor Traversal
// Time Complexity: O(min(a, b))
// Space Complexity: O(1)

class Solution {
    public int findGCD(int a, int b) {

        int gcd = 1;

        for (int i = 1; i <= Math.min(a, b); i++) {

            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }
}