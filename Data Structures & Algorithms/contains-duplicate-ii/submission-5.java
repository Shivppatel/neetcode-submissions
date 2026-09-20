class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 0) return false;
        HashSet<Integer> seen = new HashSet<>();
        int left = 0;
        int right = 0;
        while(right < nums.length){
            if (right - left > k){
                seen.remove(nums[left]);
                left++;
            }
            if (seen.contains(nums[right])){
                return true;
            }
            seen.add(nums[right]);
            right++;
        }
        return false;
    }
}