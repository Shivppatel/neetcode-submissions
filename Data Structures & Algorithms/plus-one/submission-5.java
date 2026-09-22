class Solution {
    public int[] plusOne(int[] digits) {
        int right = digits.length - 1;
        int carry = 0;
        digits[right] += 1;
        while(right >= 0){
            if (carry != 0){
                digits[right] += carry;
                carry = 0;
            }
            if (digits[right] > 9){
                carry += digits[right] - 9;
                digits[right] = digits[right] - 10;
            }
            right--;
        }
        if (carry == 0){
            return digits;
        }
        int[] output = new int[digits.length + 1];
        output[0] = carry;
        for (int idx = 1; idx < output.length; idx++){
            output[idx] = digits[idx - 1];
        }
        return output;
    }
}
