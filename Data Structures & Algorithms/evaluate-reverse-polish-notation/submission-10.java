class Solution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(String token: tokens){
            if ("+-/*".contains(token)){
                int two = stack.pop();
                int one = stack.pop();
                if (token.equals("+")){
                    stack.push(one + two);
                }
                if (token.equals("-")){
                    stack.push(one - two);
                }
                if (token.equals("/")){
                    stack.push(one / two);
                }
                if (token.equals("*")){
                    stack.push(one * two);
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
