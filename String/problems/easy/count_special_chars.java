// Problem: Count Special Characters in String
// Approach: Character Classification
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int countSpecialCharacters(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!Character.isLetterOrDigit(ch) &&
                !Character.isWhitespace(ch)) {

                count++;
            }
        }

        return count;
    }
}