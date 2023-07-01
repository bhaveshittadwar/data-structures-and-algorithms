// https://leetcode.com/problems/container-with-most-water/description/

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int start = 0;
        int end = height.length - 1;
        int vol = 0;

        while (start != end) {
            vol = Math.min(height[start], height[end]) * (end - start);
            if (vol > max) {
                max = vol;
            }
            if (height[start] > height[end]) {
                end--;
            } else if (height[start] < height[end]) {
                start++;
            } else {
                start++;
            }
        }

        return max;
    }
}