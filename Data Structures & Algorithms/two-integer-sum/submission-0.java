class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numToIndexMap = new HashMap<>();
        for (int idx = 0; idx < nums.length; idx++){
            Integer match = target - nums[idx];
            if (numToIndexMap.containsKey(match)){
                return new int[]{numToIndexMap.get(match), idx};
            } else {
                numToIndexMap.put(nums[idx], idx);
            }
        }
        return new int[0];
    }
}
