// Problem: Count Words in String
// Approach: Space Counting
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int countWords(String str) {

        if (str.length() == 0) {
            return 0;
        }

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }
}