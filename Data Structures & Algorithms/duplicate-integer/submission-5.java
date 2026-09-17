class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int idx = 0; idx< nums.length; idx++){
            if (seen.contains(nums[idx])){
                return true;
            }
            seen.add(nums[idx]);
        }
        return false;
    }
}