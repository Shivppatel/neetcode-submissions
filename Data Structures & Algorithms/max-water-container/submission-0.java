class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = Integer.MIN_VALUE;
        while (left < right){
            int smallest = heights[left] < heights[right] ? heights[left] : heights[right];
            int current = (right - left) * smallest;
            if (current > max){
                max = current;
            }
            if (heights[left] == smallest){
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
