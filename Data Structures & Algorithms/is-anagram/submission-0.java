class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
            char[] sCharArray = s.toCharArray();
            char[] tCharArray = t.toCharArray();
            Arrays.sort(sCharArray);
            Arrays.sort(tCharArray);
            for (int idx = 0; idx < s.length(); idx++){
                if (sCharArray[idx] != tCharArray[idx]){
                    return false;
                }
            }
            return true;
    }
}
