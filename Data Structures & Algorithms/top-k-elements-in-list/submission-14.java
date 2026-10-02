class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> Integer.compare(freqMap.get(b), freqMap.get(a)));

        maxHeap.addAll(freqMap.keySet());
        int[] output = new int[k];
        int idx = 0;
        while(k > 0){
            output[idx++] = maxHeap.poll();
            k--;
        }
        return output;
    }
}
