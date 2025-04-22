class Solution {
    public int maxArea(int[] h) {
        int n = h.length;
        int l = 0;
        int r = n-1;
        int maxArea = 0;
        while(l<r){
            int Area = Math.min(h[l],h[r])*(r-l);
        maxArea = Math.max(Area,maxArea);
        if(h[l]<h[r]){
            l++;
        }
        else{
         r--;
        }
    }
    return maxArea;
   }
}