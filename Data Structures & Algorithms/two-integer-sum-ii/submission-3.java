class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int slow = 0;
        int fast = numbers.length -1;

        while(slow < fast){
            int currentSum = numbers[slow] + numbers[fast];
            if (currentSum < target) {
                slow++;
            } else if (currentSum > target){
                fast--;
            } else {
                return new int[]{slow + 1, fast + 1};
            }
        }
        return new int[0];
    }
}
