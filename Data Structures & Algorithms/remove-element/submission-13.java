class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int idx = 0; idx < nums.length; idx++){
            if(nums[idx] != val){
                nums[k++] = nums[idx];
            }
        }
        return k;
    }
}