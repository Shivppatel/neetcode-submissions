class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder output = new StringBuilder();
        int idx = 0;
        while(idx < word1.length() && idx < word2.length()){
            output.append(word1.charAt(idx));
            output.append(word2.charAt(idx));
            idx += 1;
        }
        output.append(word1.substring(idx));
        output.append(word2.substring(idx));
        return output.toString();
    }
}