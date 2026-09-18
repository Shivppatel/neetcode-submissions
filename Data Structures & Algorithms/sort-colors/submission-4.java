class Solution {
    public void sortColors(int[] nums) {
        int[] colors = new int[3];
        for(int color: nums){
            colors[color] += 1;
        }
        int idx = 0;
        for(int c = 0; c < colors.length; c++){
            for (int count = 0; count < colors[c]; count++){
                nums[idx++] = c;
            }
        }
    }
}