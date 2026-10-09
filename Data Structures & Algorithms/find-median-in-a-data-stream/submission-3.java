class MedianFinder {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    public MedianFinder() {
        this.minHeap = new PriorityQueue<>();
        this.maxHeap = new PriorityQueue<>((a,b) -> Integer.compare(b, a));
    }
    
    public void addNum(int num) {
        maxHeap.add(num);
// Step 2: Ensure order invariant (maxHeap top <= minHeap top)
        if (!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
            minHeap.add(maxHeap.poll());
        }
        
        // Step 3: Rebalance sizes (maxHeap can have at most 1 more element than minHeap)
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if (maxHeap.size() == minHeap.size()){
            return (double) (maxHeap.peek() + minHeap.peek()) / 2;
        }
        return (double) maxHeap.peek();
    }
}
