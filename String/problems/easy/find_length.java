// Problem: Find Length of String
// Approach: String Traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int findLength(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;
        }

        return count;
    }
}
