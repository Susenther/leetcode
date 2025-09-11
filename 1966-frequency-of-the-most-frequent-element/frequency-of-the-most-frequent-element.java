class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums); 
        long sum = 0;
        int l = 0, res = 0;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];

            
            while ((long)(r - l + 1) * nums[r] - sum > k) {
                sum -= nums[l];
                l++;
            }

            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
