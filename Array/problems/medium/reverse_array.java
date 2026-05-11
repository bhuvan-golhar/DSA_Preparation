// Problem: Reverse an Array using Two Pointers
// Approach: In-Place Reversal
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public void reverseArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
