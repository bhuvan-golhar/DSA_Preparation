// Problem: Count Occurrences of a Substring
// Approach: Sliding Window Comparison
// Time Complexity: O(n * m)
// Space Complexity: O(1)

class Solution {
    public int countOccurrences(String str, String sub) {

        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {

            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        return count;
    }
}