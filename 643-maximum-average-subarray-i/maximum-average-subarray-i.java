class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0;
        double max = 0;
        for(int i = 0; i <= k-1; i++){
            sum = sum + nums[i];
        }
        max = sum/k;
        for(int i = k; i < n;i++){
            sum = sum + nums[i] - nums[i - k];
            max = Math.max(sum/k,max);
        }
        return max;
    }
}