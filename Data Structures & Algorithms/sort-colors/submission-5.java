class Solution {
    public void sortColors(int[] nums) {
        int[] colors = new int[3];
        for(int num: nums){
            colors[num] += 1;
        }
        int idx = 0;
        for(int colorIdx = 0; colorIdx < colors.length; colorIdx++){
            for(int tmp = 0; tmp < colors[colorIdx]; tmp++){
                nums[idx++] = colorIdx;
            }
        }
    }
}