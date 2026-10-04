class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum = Math.max(nums[j], sum + nums[j]);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}