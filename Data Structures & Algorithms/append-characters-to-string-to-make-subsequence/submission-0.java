class Solution {
    public int appendCharacters(String s, String t) {
        int sIdx = 0;
        int tIdx = 0;
        while(sIdx < s.length() && tIdx < t.length()){
            if (s.charAt(sIdx) == t.charAt(tIdx)){
                tIdx++;
            }
            sIdx++;
        }
        return t.length() - tIdx;
    }
}