class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums2Idx = nums2.length - 1;
        // int nums1Idx = m == 0 ? -1 : m - 1;
        int nums1Idx = m - 1;
        int insertIdx = nums1.length - 1;
        while(nums1Idx >= 0 && nums2Idx >= 0){
            if (nums1[nums1Idx] > nums2[nums2Idx]){
                nums1[insertIdx--] = nums1[nums1Idx--];
            } else {
                nums1[insertIdx--] = nums2[nums2Idx--];
            }
        }
        while (nums2Idx >= 0 && insertIdx >= 0){
            nums1[insertIdx--] = nums2[nums2Idx--];
        }
        // while (nums1Idx >= 0 && insertIdx >= 0){
        //     nums1[insertIdx--] = nums1[nums1Idx--];
        // }
    }
}