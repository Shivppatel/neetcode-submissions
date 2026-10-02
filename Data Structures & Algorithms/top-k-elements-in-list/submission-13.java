class Solution {
    class Pair {
        int num;
        int freq;
        public Pair(int num, int freq){
            this.num = num;
            this.freq = freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a,b) -> b.freq - a.freq);
        for (Integer key: freqMap.keySet()){
            maxHeap.add(new Pair(key, freqMap.get(key)));
        }
        int[] output = new int[k];
        int idx = 0;
        while(k > 0){
            output[idx++] = maxHeap.poll().num;
            k--;
        }
        return output;
    }
}
