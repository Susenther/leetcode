class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int []res = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while(left<=right){
            int leftsq = nums[left]*nums[left];
            int rightsq = nums[right]*nums[right];
            if(leftsq>rightsq){
                res[index] = leftsq;
                left++;
            }else{
                res[index] = rightsq;
                right--;
            }
            index--;
        }
        return res;
        
    }
}