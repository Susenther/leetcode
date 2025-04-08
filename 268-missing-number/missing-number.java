class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        int sum = 0;
        int sum1 = (N*(N+1))/2;
        for(int i = 0;i<N;i++){
            sum += nums[i];
        }
        int missingnumber = sum1 - sum;
        
        return missingnumber;
    }
    
}