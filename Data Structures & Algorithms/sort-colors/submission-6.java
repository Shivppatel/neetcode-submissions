class Solution {
    public void sortColors(int[] nums) {
        int[] colors = new int[3];
        for(int num: nums){
            colors[num] += 1;
        }
        int idx = 0;
        for(int colorIdx = 0; colorIdx < colors.length; colorIdx++){
            while(colors[colorIdx]-- > 0){
                nums[idx++] = colorIdx;
            }
        }
    }
}