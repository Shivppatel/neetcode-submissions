class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            int current = numbers[left] + numbers[right];
            if (current == target) return new int[]{left + 1, right + 1};
            if (current < target){
                left += 1;
            } else {
                right -= 1;
            }
        }
        return new int[0];
    }
}
