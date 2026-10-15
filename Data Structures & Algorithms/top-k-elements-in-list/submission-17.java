class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> cMap = new HashMap<>();
        for(int num: nums){
            cMap.put(num, cMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));
        for(int key: cMap.keySet()){
            maxHeap.add(new int[]{key, cMap.get(key)});
        }
        int[] output = new int[k];
        while(k > 0){
            output[output.length - k] = maxHeap.poll()[0];
            k -= 1;
        }
        return output;
    }
}
