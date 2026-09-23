class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIdx = 0;
        for(Character ch: t.toCharArray()){
            if (sIdx == s.length()) return true;
            if (s.charAt(sIdx) == ch){
                sIdx++;
            }
        }
        return sIdx == s.length();
    }
}