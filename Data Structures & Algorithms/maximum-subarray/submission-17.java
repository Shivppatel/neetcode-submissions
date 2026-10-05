class Solution {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int maxSum = nums[0];
        for(int idx = 0; idx < nums.length; idx++){
            if (sum < 0){
                sum = 0;
            }
            sum += nums[idx];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
