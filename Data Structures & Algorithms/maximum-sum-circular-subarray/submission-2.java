class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int globMax = nums[0];
        int globMin = nums[0];
        int curMax = 0;
        int curMin = 0;
        int total = 0;
        for (int num: nums){
            curMax = Math.max(curMax + num, num);
            globMax = Math.max(globMax, curMax);
            curMin = Math.min(curMin + num, num);
            globMin = Math.min(globMin, curMin);
            total += num;
        }
        return globMax > 0 ? Math.max(globMax, total - globMin) : globMax;
    }
}