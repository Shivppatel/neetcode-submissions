class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int current = 0;
        for(int num: nums){
            if (current < 0){
                current = 0;
            }
            current += num;
            max = Math.max(current, max);
        }
        return max;
    }
}
