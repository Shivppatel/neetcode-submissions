class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;
        while (left < right) {
            int smallest =
                heights[left] < heights[right] ? heights[left] : heights[right];
            int currentArea = smallest * (right - left);
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }

            if (smallest == heights[left]) {
                left++;
            } else {
                right--;
            }        
        }
        return maxArea;
    }
}
