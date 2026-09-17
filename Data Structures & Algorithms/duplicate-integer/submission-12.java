class Solution {
    public boolean hasDuplicate(int[] nums) {
		int left = 0;
		int right = 1;
		Arrays.sort(nums);
		while (right < nums.length){
			if (nums[left] == nums[right]){
				return true;
			}
			left++;
			right++;
		}
       	// HashSet<Integer> seen = new HashSet<>();
		// for (int num : nums){
		// 	if (seen.contains(num)){
		// 		return true;
		// 	}
		// 	seen.add(num);
		// } 
		return false;
    }
}