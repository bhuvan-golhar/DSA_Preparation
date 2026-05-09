// Problem: Find Sum of Numbers from 1 to N
// Approach: Accumulation Pattern
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int findSum(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}
