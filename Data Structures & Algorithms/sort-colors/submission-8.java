class Solution {
    public void sortColors(int[] nums) {
        int[] colorCount = new int[3];
        for(int num: nums){
            colorCount[num] += 1;
        }
        int idx = 0;
        for(int colorIdx = 0; colorIdx < colorCount.length; colorIdx++){
            for(int tmp = 0; tmp < colorCount[colorIdx]; tmp++){
                nums[idx++] = colorIdx;
            }
        }
    }
}