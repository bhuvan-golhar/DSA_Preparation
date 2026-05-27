// Problem: Check Armstrong Number
// Approach: Digit Extraction with Power Accumulation
// Time Complexity: O(d)
// Space Complexity: O(1)

class Solution {
    public boolean isArmstrong(int n) {

        int original = n;
        int temp = n;
        int digitCount = 0;
        int sum = 0;

        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }

        temp = n;

        while (temp > 0) {

            int digit = temp % 10;
            sum += Math.pow(digit, digitCount);

            temp /= 10;
        }

        return sum == original;
    }
}