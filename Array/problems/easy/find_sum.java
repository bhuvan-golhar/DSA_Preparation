// Problem: Find Sum of Elements in Array
// Approach: Linear Traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int findSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
