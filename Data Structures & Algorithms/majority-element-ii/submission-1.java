class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        HashSet<Integer> output = new HashSet<>();
        for(int num: nums){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > nums.length / 3){
                output.add(num);
            }
        }
        return new ArrayList<>(output);
    }
}