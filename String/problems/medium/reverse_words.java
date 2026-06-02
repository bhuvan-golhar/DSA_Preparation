// Problem: Reverse Words in a String
// Approach: Split and Reverse Traversal
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public String reverseWords(String str) {

        String[] words = str.split(" ");

        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {

            result += words[i];

            if (i != 0) {
                result += " ";
            }
        }

        return result;
    }
}