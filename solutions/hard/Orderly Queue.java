// Title: Orderly Queue
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/orderly-queue/


class Solution {
    public String orderlyQueue(String s, int k) {
        if (k > 1) {
            char[] chars = s.toCharArray();
            java.util.Arrays.sort(chars);
            return new String(chars);
        }

        String smallest = s;
        for (int i = 1; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);

            if (rotated.compareTo(smallest) < 0) {
                smallest = rotated;
