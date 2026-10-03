class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer, Set<Integer>> trustMap = new HashMap<>();
        for(int[] rel: trust){
            trustMap.putIfAbsent(rel[0], new HashSet());
            trustMap.computeIfPresent(rel[0], (key, set) -> {
                set.add(rel[1]);
                return set;
            });
        }
        for(int idx = 1; idx <= n; idx++){
            boolean trusted = true;
            if (!trustMap.containsKey(idx)){
                for(Integer key: trustMap.keySet()){
                    if (!trustMap.get(key).contains(idx)){
                        trusted = false;
                        break;
                    }
                }
            } else {
                continue;
            }
            if (trusted == true) return idx;
        }
        return -1;
    }
}