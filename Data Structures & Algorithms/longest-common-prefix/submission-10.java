class Solution {
    public String longestCommonPrefix(String[] strs) {
        for (int idx = 0; idx < strs[0].length(); idx++){
            for (String str: strs){
                if (str.length() - 1 < idx || str.charAt(idx) != strs[0].charAt(idx)) return str.substring(0, idx);
            }
        }
        return strs[0];
    }
}