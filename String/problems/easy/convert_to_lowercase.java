// Problem: Convert String to Lowercase
// Approach: Character Conversion
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public String convertToLowercase(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            result += Character.toLowerCase(str.charAt(i));
        }

        return result;
    }
}