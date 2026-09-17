class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int idx = 0; idx < nums.length; idx++){
            int match = target - nums[idx];
            if(seen.containsKey(match)){
                return new int[]{seen.get(match), idx};
            } else {
                seen.put(nums[idx], idx);
            }
        }
         return new int[]{-1, -1};
    }
}
