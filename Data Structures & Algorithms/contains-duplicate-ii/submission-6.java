class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 0) return false;
        int left = 0;
        int right = 0;
        HashSet<Integer> seen = new HashSet<>();
        while(right < nums.length){
            while(right - left > k){
                seen.remove(nums[left++]);
            }
            if (seen.contains(nums[right])){
                return true;
            }
            seen.add(nums[right++]);
        }
        return false;
    }
}