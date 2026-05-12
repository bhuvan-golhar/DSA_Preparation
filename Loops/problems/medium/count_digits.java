// Problem: Count Digits in a Number
// Approach: Repeated Division
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution {
    public int countDigits(int n) {

        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }

        return count;
    }
}
