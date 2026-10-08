class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for(int idx = 0; idx < nums.length; idx++){
            int lookingFor = target - nums[idx];
            if (seen.containsKey(lookingFor)){
                return new int[]{seen.get(lookingFor), idx};
            }
            seen.put(nums[idx], idx);
        }
        return new int[0];
    }
}
