// Problem: Convert String to Uppercase
// Approach: Character Conversion
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public String convertToUppercase(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            result += Character.toUpperCase(str.charAt(i));
        }

        return result;
    }
}