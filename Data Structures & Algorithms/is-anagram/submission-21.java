class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int idx = 0; idx < s.length(); idx++){
            sMap.putIfAbsent(s.charAt(idx), 0);
            tMap.putIfAbsent(t.charAt(idx), 0);
            sMap.put(s.charAt(idx), sMap.get(s.charAt(idx)) + 1);
            tMap.put(t.charAt(idx), tMap.get(t.charAt(idx)) + 1);
        }
        return sMap.equals(tMap);
    }
}
