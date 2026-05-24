// Problem: Product of Array Except Self
// Approach: Prefix and Suffix Product
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] productExceptSelf(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];

        result[0] = 1;

        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * arr[i - 1];
        }

        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix *= arr[i];
        }

        return result;
    }
}