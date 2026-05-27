// Problem: Check Happy Number
// Approach: Repeated Digit Square Sum Transformation
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution {
    public boolean isHappyNumber(int n) {

        while (n != 1 && n != 4) {

            int sum = 0;

            while (n > 0) {

                int digit = n % 10;
                sum += digit * digit;

                n /= 10;
            }

            n = sum;
        }

        return n == 1;
    }
}