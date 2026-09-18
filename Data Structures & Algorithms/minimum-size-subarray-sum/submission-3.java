class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int currentSum = 0;
        int output = Integer.MAX_VALUE;
        while(right < nums.length){
            currentSum += nums[right];
            while (currentSum >= target){
                currentSum -= nums[left];
                output = Math.min(output, right - left + 1);
                left += 1;
            }
            right++;
        }
        return output == Integer.MAX_VALUE ? 0 : output;
    }
}