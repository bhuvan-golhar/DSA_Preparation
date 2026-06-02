// Problem: Find Most Frequent Character
// Approach: Frequency Counting
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public char findMostFrequentChar(String str) {

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char result = str.charAt(0);
        int maxFreq = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                result = ch;
            }
        }

        return result;
    }
}