import java.util.*;
class Solution {
    public static boolean check(int[] nums) {
        int count =0;
        int n = nums.length;

        for(int i = 0;i < n; i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
                if(count>1){
                    return false;
                }
            }
        
        
        }
        return true;
    }
    public static void main(String []  args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0;i<n;i++){
           nums[i] = sc.nextInt();
        }
        boolean result = check(nums);
        System.out.print(" "+result);
    }
    
}