class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder output = new StringBuilder();
        for (int idx = 0; idx < strs[0].length(); idx++){
            for (String str: strs){
                if (str.length() - 1 < idx || str.charAt(idx) != strs[0].charAt(idx)) return output.toString();
            }
            output.append(strs[0].charAt(idx));
        }
        return output.toString();
    }
}