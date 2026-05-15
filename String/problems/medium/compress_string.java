// Problem: Compress a String
// Approach: Consecutive Character Grouping
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public String compressString(String str) {

        if (str.length() == 0) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }

        compressed.append(str.charAt(str.length() - 1));
        compressed.append(count);

        return compressed.toString();
    }
}