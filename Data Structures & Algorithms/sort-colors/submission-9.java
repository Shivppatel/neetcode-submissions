class Solution {
    public void sortColors(int[] nums) {
        int[] colorCount = new int[3];
        for(int num: nums){
            colorCount[num] += 1;
        }
        int idx = 0;
        for(int colorIdx = 0; colorIdx < colorCount.length; colorIdx++){
            while(colorCount[colorIdx]-- > 0){
                nums[idx++] = colorIdx;
            }
        }
    }
}