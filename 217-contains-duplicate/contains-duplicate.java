class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                count++;
            }
            map.put(nums[i],i);
        }
        if(count > 1){
            return true;
        }else{
            return false;
        }
    }
}