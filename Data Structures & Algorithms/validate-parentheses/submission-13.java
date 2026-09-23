class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(Character ch: s.toCharArray()){
            if (ch == '('){
                stack.push(')');
            } else if (ch == '['){
                stack.push(']');
            } else if (ch == '{'){
                stack.push('}');
            } else {
                if (stack.peek() != ch) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
