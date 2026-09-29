class NumArray {
    int[] prefixSums;

    public NumArray(int[] nums) {
        this.prefixSums = new int[nums.length];
        int sum = 0;
        int idx = 0;
        for (int num: nums){
            sum += num;
            prefixSums[idx++] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        int r = prefixSums[right];
        int l = left > 0 ? prefixSums[left - 1] : 0;
        return r - l;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */