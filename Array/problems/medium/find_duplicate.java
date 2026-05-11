// Problem: Find Duplicate Element in Array
// Approach: Nested Traversal
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {

    public int findDuplicate(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return -1;
    }
}
