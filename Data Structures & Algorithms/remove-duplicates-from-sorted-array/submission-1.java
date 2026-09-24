class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int idx = 1; idx < nums.length; idx++){
            if (nums[idx] != nums[k]){
                k++;
            }
            nums[k] = nums[idx];
        }
        return k + 1;
    }
}