// Problem: Find Maximum Element in Array
// Approach: Linear Traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
