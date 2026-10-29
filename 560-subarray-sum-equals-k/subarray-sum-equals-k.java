class Solution {
    public int subarraySum(int[] arr, int k) {
                int n = arr.length;
        
        HashMap <Integer,Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        int prevSum = 0;
        map.put(0,1);
        for(int i = 0;i<n;i++){
            sum += arr[i];
            prevSum = sum - k;

            count += map.getOrDefault(prevSum,0);

            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}