import java.util.Scanner;
class Solution {
    public void  reverseString(char[] a) {
            
            int i = 0;
            int j  = a.length - 1;

            while(i<j){
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            
            }
    
     }


}
          
        