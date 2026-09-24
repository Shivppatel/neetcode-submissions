class Solution {
    public boolean validPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        int removals = 1;
        while(left <= right){
            if (Character.isLetterOrDigit(s.charAt(left)) &&
                Character.isLetterOrDigit(s.charAt(right))){
                if (s.charAt(left) == s.charAt(right)){
                    left += 1;
                    right -= 1;
                } else {
                    return isPalindrome(s.substring(left + 1, right + 1)) ||                        isPalindrome(s.substring(left, right));
                }
            } else if (!Character.isLetterOrDigit(s.charAt(left))){
                left += 1;
            } else {
                right -= 1;
            }
        }
        return true;
    }

    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left <= right){
            if (Character.isLetterOrDigit(s.charAt(left)) &&
            Character.isLetterOrDigit(s.charAt(right))){
                if (s.charAt(left) != s.charAt(right)){
                    return false;
                }
                left += 1;
                right -= 1;
            } else if (!Character.isLetterOrDigit(s.charAt(left))){
                left += 1;
            } else {
                right -= 1;
            }
        }
        return true;
    }
}