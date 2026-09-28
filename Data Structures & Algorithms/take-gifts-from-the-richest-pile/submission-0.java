class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> b - a);
        for (int gift: gifts){
            heap.add(gift);
        }
        while (k > 0){
            Integer val = heap.poll();
            heap.add((int) Math.sqrt(val));
            k -= 1;
        }

        int sum = 0;
        while(!heap.isEmpty()){
            sum += heap.poll();
        }
        return sum;
    }
}