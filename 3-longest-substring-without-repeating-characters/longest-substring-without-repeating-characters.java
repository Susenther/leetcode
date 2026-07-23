class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;int right = 0;int maxLen = 0;
        while(right < s.length()){
           char ch = s.charAt(right);
           if(!set.contains(ch)){
            set.add(ch);
             right++;
             maxLen = Math.max(maxLen, right - left);
           }else{
            set.remove(s.charAt(left));
            left++;
           }
        }
        return maxLen;
    }
}