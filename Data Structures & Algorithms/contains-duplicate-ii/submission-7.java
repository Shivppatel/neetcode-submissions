class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> seen = new HashSet<>();
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            if (right - left > k){
                seen.remove(nums[left++]);
            }
            if(seen.contains(nums[right])) return true;
            seen.add(nums[right]);
        }
        return false;
    }
}