// Problem: Find Missing Number
// Approach: Sum Formula
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int findMissingNumber(int[] arr, int n) {

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}