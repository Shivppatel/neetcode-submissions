class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = -1;
        while(left < right){
            int height = Math.min(heights[left], heights[right]);
            int area = height * (right - left);
            max = Math.max(area, max);
            if (heights[left] == heights[right]){
                left += 1;
                right -= 1;
            } else if (heights[left] < heights[right]){
                left += 1;
            } else {
                right -=1;
            }
        }
        return max;
    }
}
