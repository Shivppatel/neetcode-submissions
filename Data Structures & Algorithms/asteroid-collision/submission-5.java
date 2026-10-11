class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int ast : asteroids) {
            boolean exploded = false;

            // Only collides if stack top is moving right (> 0) and current is moving left (< 0)
            while (!stack.isEmpty() && stack.peek() > 0 && ast < 0) {
                int prev = stack.peek();

                if (Math.abs(prev) < Math.abs(ast)) {
                    // Previous asteroid explodes; current continues
                    stack.pop();
                } else if (Math.abs(prev) == Math.abs(ast)) {
                    // Both explode
                    stack.pop();
                    exploded = true;
                    break;
                } else {
                    // Current asteroid explodes
                    exploded = true;
                    break;
                }
            }

            // If the incoming asteroid didn't explode, push it onto the stack
            if (!exploded) {
                stack.push(ast);
            }
        }

        // Reconstruct the array in original order
        int[] output = new int[stack.size()];
        for (int idx = output.length - 1; idx >= 0; idx--) {
            output[idx] = stack.pop();
        }

        return output;
    }
}