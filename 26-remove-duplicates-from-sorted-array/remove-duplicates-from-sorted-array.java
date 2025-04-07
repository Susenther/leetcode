import java.util.*;
class Solution{
static int removeDuplicates(int [] nums){
    if(nums.length == 0){
        return 0;
    }
    int j=0;
    for(int i=1;i<nums.length;i++){
    if(nums[i] != nums[j]){
        j++;
        nums[j] = nums[i];
    }
}
    return j+1;

}
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int length = removeDuplicates(arr);
    System.out.println("number of unique elements"+length) ;
    System.out.print("Modified Array");
    for(int i=0;i<length;i++){
        System.out.print(arr[i] +" ");
    }
  }
}
