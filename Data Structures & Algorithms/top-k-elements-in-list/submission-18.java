class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for(int num: nums){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));
        for(Integer key: countMap.keySet()){
            maxHeap.add(new int[]{key, countMap.get(key)});
        }
        int[] output = new int[k];
        while(k > 0){
            output[k - 1] = maxHeap.poll()[0];
            k -= 1;
        }
        return output;
    }
}
