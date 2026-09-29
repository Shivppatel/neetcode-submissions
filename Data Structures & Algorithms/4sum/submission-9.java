class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        for(int idx1 = 0; idx1 < nums.length - 3; idx1++){
            for(int idx2 = idx1 + 1; idx2 < nums.length - 2; idx2++){
                int left = idx2 + 1;
                int right = nums.length - 1;
                while(left < right){
                    long sum = (long) nums[idx1] + nums[idx2] + nums[left] + nums[right];
                    if (sum == target){
                        set.add(List.of(nums[idx1], nums[idx2], nums[left], nums[right]));
                        left++;
                        right--;
                    } else if (sum < target){
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}