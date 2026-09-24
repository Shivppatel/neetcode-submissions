class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int cur = 0;
        int left = 0;
        int right = 0;
        HashSet<Character> seen = new HashSet<>();
        while(right < s.length()){
            while (seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                cur -= 1;
                left += 1;
            }
            seen.add(s.charAt(right));
            cur += 1;
            right += 1;
            max = Math.max(max, cur);
        }
        return max;
    }
}
