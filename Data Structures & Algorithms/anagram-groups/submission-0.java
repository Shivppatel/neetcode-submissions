class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String, List<String>> anagrams = new HashMap<>();
      for (String str: strs) {
        char[] strCharArray = str.toCharArray();
        Arrays.sort(strCharArray);
        String key = new String(strCharArray);
        if (!anagrams.containsKey(key)){
            anagrams.put(key, new ArrayList());
        }
        anagrams.get(key).add(str);
      }
      return new ArrayList(anagrams.values());
    }
}
