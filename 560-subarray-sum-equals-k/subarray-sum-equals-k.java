class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer,Integer> SumCount = new HashMap<>();

        int prefix = 0;
        int count = 0;

        SumCount.put(0,1);

        for(int i = 0;i<n;i++){
            prefix += nums[i];

           int remove = prefix - k;

           if(SumCount.containsKey(remove)){
            count += SumCount.get(remove);
           }
            SumCount.put(prefix,SumCount.getOrDefault(prefix,0)+1);
        }
          return count;
        
    }
}