class Solution {
    public int findMin(int[] nums) {
    int max = Integer.MIN_VALUE;
    int maxIdx = -1;
    for(int idx = 0; idx < nums.length; idx++){
        if (nums[idx] > max){
            max = nums[idx];
            maxIdx = idx;
        }
    }
    int left = 0;
    int right = maxIdx;
    if (right == nums.length - 1){
        return nums[left];
    }
    return Math.min(nums[left], nums[right + 1]);
    }
}
