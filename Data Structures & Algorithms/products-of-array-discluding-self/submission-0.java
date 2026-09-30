class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        int[] postfixProduct = new int[nums.length];
        prefixProduct[0] = 1;
        postfixProduct[nums.length - 1] = 1;
        for(int idx = 1; idx < nums.length; idx++){
            prefixProduct[idx] = nums[idx - 1] * prefixProduct[idx - 1];
        }
        for (int idx = nums.length -2; idx >= 0; idx--){
            postfixProduct[idx] = nums[idx + 1] * postfixProduct[idx + 1];     
        }

        for(int idx = 0; idx < nums.length; idx++){
            nums[idx] = prefixProduct[idx] * postfixProduct[idx];
        }
        return nums;
    }
}  
