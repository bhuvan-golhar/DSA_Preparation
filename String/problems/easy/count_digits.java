// Problem: Count Digits in String
// Approach: Character Traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int countDigits(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}