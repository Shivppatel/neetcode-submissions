class Solution {
    public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()){
			return false;
		}
		HashMap<Character, Integer> countS = new HashMap<>();
		HashMap<Character, Integer> countT = new HashMap<>();

		for (int idx = 0; idx < s.length(); idx++){
			countS.put(s.charAt(idx), countS.getOrDefault(s.charAt(idx), 0) + 1);
			countT.put(t.charAt(idx), countT.getOrDefault(t.charAt(idx), 0) + 1);
		}
		return countS.equals(countT);
    }
}
