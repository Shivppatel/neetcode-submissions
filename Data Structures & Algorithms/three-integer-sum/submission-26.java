class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        for(int idx = 0; idx < nums.length - 2; idx++){
            int left = idx + 1;
            int right = nums.length - 1;
            while (left < right){
                int sum = nums[idx] + nums[left] + nums[right];
                if (sum == 0){
                    set.add(List.of(nums[idx], nums[left], nums[right]));
                    left += 1;
                    right -= 1;
                } else if (sum > 0){
                    right -= 1;
                } else {
                    left += 1;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
