class Solution {
    public int maxSubArray(int[] nums) {
        int left = 0;
        int right = 0;
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        while (right < nums.length){
            currentSum += nums[right];
            if (currentSum > max){
                max = currentSum;
            }
            if (currentSum <= 0){
                currentSum = 0;
                left = right;
            }
            right++;
        }
        return max;
    }
}
