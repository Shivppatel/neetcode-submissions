class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str: strs){
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);
            String sortedStr = new String(strArray);
            map.putIfAbsent(sortedStr, map.getOrDefault(sortedStr, new ArrayList<>()));
            map.get(sortedStr).add(str);
        }
        for(List<String> val: map.values()){
            output.add(val);
        }
        return output;
    }
}
