class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int idx = 0; idx < nums.length; idx++){
            Integer match = target - nums[idx];
            if (seen.containsKey(match)) {
                return new int[]{seen.get(match), idx};
            }
            seen.put(nums[idx], idx);
        }
        return new int[]{};
    }
}
