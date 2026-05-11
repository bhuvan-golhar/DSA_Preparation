// Problem: Move All Zeroes to End
// Approach: In-Place Rearrangement
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public void moveZeroes(int[] arr) {

        int position = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[position] = arr[i];
                position++;
            }
        }

        while (position < arr.length) {
            arr[position] = 0;
            position++;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
