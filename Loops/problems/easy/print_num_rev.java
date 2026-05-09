// Problem: Print Numbers from N to 1
// Approach: Reverse Iteration
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public void printReverseNumbers(int n) {

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
