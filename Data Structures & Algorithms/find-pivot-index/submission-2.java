class Solution {
    public int pivotIndex(int[] nums) {
       for(int idx = 1; idx < nums.length; idx++){
        nums[idx] = nums[idx] + nums[idx -1];
       }
       int pointer = 0;
       while (pointer < nums.length){
        int leftSum = pointer == 0 ? 0 : nums[pointer - 1];
        int rightSum = nums[nums.length - 1] - nums[pointer];
        System.out.println("POINTER: " + pointer);
        System.out.println("LEFT SUM: " + leftSum + " RIGHT SUM: " + rightSum);
        if (leftSum == rightSum) return pointer;
        pointer += 1;
       }
       return -1;
    }
}