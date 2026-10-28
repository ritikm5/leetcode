// Title: Bitwise ORs of Subarrays
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/bitwise-ors-of-subarrays/

import java.util.*;

class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> all = new HashSet<>();

        Set<Integer> prev = new HashSet<>();

        for (int num : arr) {
            Set<Integer> curr = new HashSet<>();

            // Subarray containing only arr[i]
            curr.add(num);

            // Extend every previous subarray
