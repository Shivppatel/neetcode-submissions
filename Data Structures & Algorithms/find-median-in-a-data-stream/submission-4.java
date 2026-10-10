class MedianFinder {
    PriorityQueue<Integer> leftHeap;
    PriorityQueue<Integer> rightHeap;

    public MedianFinder() {
        this.leftHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        this.rightHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        leftHeap.add(num);
        if(!rightHeap.isEmpty() &&
            leftHeap.peek() > rightHeap.peek()){
                rightHeap.add(leftHeap.poll());
        }
        if (leftHeap.size() > rightHeap.size() + 1){
            rightHeap.add(leftHeap.poll());
        } else if (rightHeap.size() > leftHeap.size()){
            leftHeap.add(rightHeap.poll());
        }
    }
    
    public double findMedian() {
        if (leftHeap.size() == rightHeap.size()){
            return (double) (leftHeap.peek() + rightHeap.peek()) / 2;
        }
        return (double) leftHeap.peek();
    }
}
