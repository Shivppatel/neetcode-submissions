class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] delta = new int[n + 1];
        for(int[] t: trust){
            delta[t[0]] -= 1;
            delta[t[1]] += 1;
        }
        for(int idx = 1; idx <= n; idx++){
            if (delta[idx] == n - 1) return idx;
        }
        return -1;
    }
}