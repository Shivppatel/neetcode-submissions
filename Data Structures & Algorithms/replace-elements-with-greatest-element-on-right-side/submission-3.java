class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int idx = arr.length - 1; idx >= 0; idx--){
            int tmp = arr[idx];
            arr[idx] = max;
            max = Math.max(max, tmp);
        }
        return arr;
    }
}