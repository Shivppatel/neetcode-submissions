class Solution {
    public void rotate(int[] nums, int k) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int num: nums){
            deque.add(num);
        }
        while(k > 0){
            deque.addFirst(deque.removeLast());
            k--;
        }
        int idx = 0;
        while(!deque.isEmpty()){
            nums[idx++] = deque.removeFirst();
        }
    }
}