// Problem: Find Average of Array Elements
// Approach: Sum Accumulation
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public double findAverage(int[] arr) {

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }
}