// Problem: Check String Rotation
// Approach: Concatenation Check
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public boolean isRotation(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        String doubled = str1 + str1;

        return doubled.contains(str2);
    }
}