// Problem: Find All Permutations of a String
// Approach: Backtracking
// Time Complexity: O(n * n!)
// Space Complexity: O(n)

import java.util.*;

class Solution {
    public List<String> findPermutations(String str) {

        List<String> result = new ArrayList<>();
        char[] chars = str.toCharArray();

        generatePermutations(chars, 0, result);

        return result;
    }

    private void generatePermutations(char[] chars, int index, List<String> result) {

        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {

            swap(chars, index, i);

            generatePermutations(chars, index + 1, result);

            swap(chars, index, i);
        }
    }

    private void swap(char[] chars, int i, int j) {

        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}