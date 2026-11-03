class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        int idx = 0;
        while(idx < s.length()){
            sMap.put(s.charAt(idx), sMap.getOrDefault(s.charAt(idx), 0) + 1);
            tMap.put(t.charAt(idx), tMap.getOrDefault(t.charAt(idx), 0) + 1);
            idx += 1;
        }
        return sMap.equals(tMap);
    }
}
