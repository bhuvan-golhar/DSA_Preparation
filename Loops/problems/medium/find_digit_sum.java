// Problem: Find Sum of Digits of a Number
// Approach: Digit Extraction
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution {
    public int findDigitSum(int n) {

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }

        return sum;
    }
}
