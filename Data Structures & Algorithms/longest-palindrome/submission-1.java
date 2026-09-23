class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        int res = 0;
        for (Character ch: s.toCharArray()){
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
            if (countMap.get(ch) % 2 == 0){
                res += 2;
            }
        }
        return res + (res < s.length() ? 1 : 0);
    }
}