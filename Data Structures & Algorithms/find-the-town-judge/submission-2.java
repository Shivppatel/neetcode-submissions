class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] incoming = new int[n + 1];
        int[] outgoing = new int[n + 1];
        for (int[] t: trust){
            outgoing[t[0]]++;
            incoming[t[1]]++;
        }
        for (int idx = 1; idx <= n; idx++){
            if (incoming[idx] == n - 1 && outgoing[idx] == 0) return idx;
        }
        return -1;
    }
}