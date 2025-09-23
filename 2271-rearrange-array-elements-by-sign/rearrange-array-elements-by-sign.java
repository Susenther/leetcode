class Solution {
    public int[] rearrangeArray(int[] nums){
       int odd  = 0;
       int even = 1;
       int []res = new int[nums.length];
       for(int i = 0;i<nums.length;i++){
        if(nums[i]>0){
            res[odd] = nums[i];
            odd += 2;
        }else{
            res[even] = nums[i];
            even  += 2;
        }
       }
       return res;
    }
}