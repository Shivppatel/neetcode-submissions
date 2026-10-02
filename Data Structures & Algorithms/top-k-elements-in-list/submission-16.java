class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a,b) -> Integer.compare(freqMap.get(b), freqMap.get(a))
        );
        int[] output = new int[k];

        for (int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        maxHeap.addAll(freqMap.keySet());
        
        for(int idx = 0; idx < k; idx++){
            output[idx] = maxHeap.poll();
        }
        
        return output;
    }
}
