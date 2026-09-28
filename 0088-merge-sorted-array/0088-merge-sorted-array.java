class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = nums1[i];
        }
        int k = 0;
        int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (k == m) {
                nums1[i] = nums2[j];
                j++;
            } else if (j == n) {
                nums1[i] = temp[k];
                k++;
            } else if (temp[k] < nums2[j]) {
                nums1[i] = temp[k];
                k++;
            } else {
                nums1[i] = nums2[j];
                j++;
            }
        }
    }
}