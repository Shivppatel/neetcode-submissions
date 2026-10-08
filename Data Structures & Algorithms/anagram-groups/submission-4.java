class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> aMap = new HashMap<>();
        for(String str: strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            aMap.putIfAbsent(sortedStr, new ArrayList<>());
            aMap.get(sortedStr).add(str);
        }
        return new ArrayList<>(aMap.values());
    }
}
