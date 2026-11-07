class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        int []counts = new int[26];
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            counts[ch - 'a']++;
        }
        for(int j = 0;j<t.length();j++){
            char sh = t.charAt(j);
            counts[sh - 'a']--;
            if(counts[sh - 'a']<0)return false;
        }
        return true;
    }
}