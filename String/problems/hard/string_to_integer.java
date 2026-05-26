// Problem: Convert String to Integer (atoi)
// Approach: Character Parsing
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int stringToInteger(String str) {

        int index = 0;
        int sign = 1;
        int result = 0;

        while (index < str.length() && str.charAt(index) == ' ') {
            index++;
        }

        if (index < str.length() &&
            (str.charAt(index) == '+' || str.charAt(index) == '-')) {

            if (str.charAt(index) == '-') {
                sign = -1;
            }

            index++;
        }

        while (index < str.length() &&
               Character.isDigit(str.charAt(index))) {

            int digit = str.charAt(index) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }
}