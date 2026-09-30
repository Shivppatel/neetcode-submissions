class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = 1;
        for (int idx = 1; idx < nums.length; idx++){
            output[idx] = output[idx - 1] * nums[idx - 1];
        }
        int postFix = 1;
        for (int idx = nums.length - 1; idx >= 0; idx--){
            output[idx] *= postFix;
            postFix *= nums[idx];
        }
        return output;
    }
}  
