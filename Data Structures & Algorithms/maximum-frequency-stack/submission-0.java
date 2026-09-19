class FreqStack {
    List<Integer> stack;
    HashMap<Integer, Integer> freqMap;

    public FreqStack() {
        this.stack = new ArrayList<>();
        this.freqMap = new HashMap<>();
    }
    
    public void push(int val) {
        stack.add(val);
        freqMap.putIfAbsent(val, 0);
        freqMap.put(val, freqMap.get(val) + 1);
    }
    
    public int pop() {
        int maxFreq = -1;
        for(Map.Entry<Integer, Integer> entry: freqMap.entrySet()){
            maxFreq = Math.max(maxFreq, entry.getValue());
            // System.out.println("VAL: " + entry.getKey() + " FREQ: " + entry.getValue());
        }
        for(int idx = stack.size() - 1; idx >= 0; idx--){
            int node = stack.get(idx);
            // if (!freqMap.containsKey(node)) return -1;
            if (freqMap.get(node) == maxFreq){
                stack.remove(idx);
                freqMap.put(node, freqMap.get(node) - 1);
                return node;
            }
        }

        
        return -1;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */