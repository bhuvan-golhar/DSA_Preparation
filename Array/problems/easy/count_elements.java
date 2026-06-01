// Problem: Count Elements in Array
// Approach: Array Traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int countElements(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count++;
        }

        return count;
    }
}