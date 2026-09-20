class MedianFinder {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
        this.minHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        this.maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(a, b));
    }
    
    public void addNum(int num) {
        minHeap.add(num);
        if(!minHeap.isEmpty() && !maxHeap.isEmpty() && minHeap.peek() > maxHeap.peek()){
            maxHeap.add(minHeap.poll());
        }

        if (minHeap.size() > maxHeap.size() + 1){
            maxHeap.add(minHeap.poll());
        }
        if (maxHeap.size() > minHeap.size() + 1){
            minHeap.add(maxHeap.poll());
        }
    }
    
    public double findMedian() {
        if (minHeap.size() == maxHeap.size()){
            return (double) (minHeap.peek() + maxHeap.peek()) / 2;
        }

        if (minHeap.size() > maxHeap.size()){
            return (double) minHeap.peek();
        }
        return (double) maxHeap.peek();
    }
}
