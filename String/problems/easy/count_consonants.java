// Problem: Count Consonants in String
// Approach: Character Traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int countConsonants(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (ch >= 'a' && ch <= 'z') {

                if (ch != 'a' &&
                    ch != 'e' &&
                    ch != 'i' &&
                    ch != 'o' &&
                    ch != 'u') {

                    count++;
                }
            }
        }

        return count;
    }
}