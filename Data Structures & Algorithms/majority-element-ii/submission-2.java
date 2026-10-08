class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> cMap = new HashMap<>();
        HashSet<Integer> output = new HashSet<>();
        for(int num: nums){
            cMap.putIfAbsent(num, 0);
            cMap.put(num, cMap.get(num) + 1);
            if (cMap.get(num) > nums.length / 3){
                output.add(num);
            }
        }
        return new ArrayList<>(output);
    }
}