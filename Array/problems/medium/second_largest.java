// Problem: Find Second Largest Element in Array
// Approach: Optimized Traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public int findSecondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {

                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest &&
                       arr[i] != largest) {

                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
