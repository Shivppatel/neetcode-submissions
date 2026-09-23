class Solution {
    public int calPoints(String[] operations) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(String op: operations){
            if (op.equals("+")){
                int two = stack.pop();
                int one = stack.pop();
                stack.push(one);
                stack.push(two);
                stack.push(one + two);
            } else if (op.equals("D")){
                int one = stack.pop();
                stack.push(one);
                stack.push(one * 2);
            } else if (op.equals("C")){
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}