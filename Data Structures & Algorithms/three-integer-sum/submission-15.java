class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> trips = new ArrayList<>();
        for (int idx = 0; idx < nums.length; idx++){
            if (nums[idx] > 0) break;
            if (idx > 0 && nums[idx] == nums[idx - 1]) continue;
            
            int left = idx + 1;
            int right = nums.length - 1;
            while (left < right){
                int current = nums[idx] + nums[left] + nums[right];
                if (current < 0){
                    left++;
                } else if (current > 0){
                    right--;
                } else {
                    trips.add(Arrays.asList(nums[idx], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                }
            }
        }
        return trips;
    }
}
