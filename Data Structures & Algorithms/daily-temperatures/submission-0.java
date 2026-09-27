class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];
        ArrayDeque<int[]> stack = new ArrayDeque<>();
        for (int idx = 0; idx < temperatures.length; idx++){
            int t = temperatures[idx];
            while (!stack.isEmpty() && t > stack.peek()[0]){
                int[] pair = stack.pop();
                output[pair[1]] = idx - pair[1];
            }
            stack.push(new int[]{t, idx});
        }
        return output;
    }
}
