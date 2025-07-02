class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        char[] c = s.toCharArray();
        int i= s.length()-1;
        while(i>=0 && c[i]== ' '){
            i--;
        }
        while(i>=0 && c[i]!= ' '){
            count ++;
            i--;
        }
        return count;
        
   }
}