class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] output = new int[nums.length * 2];
        for(int idx = 0; idx < nums.length; idx++){
            output[idx] = nums[idx];
            output[idx + nums.length] = nums[idx];
        }
        return output;
    }
}