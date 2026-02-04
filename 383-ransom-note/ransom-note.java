class Solution{
    public boolean canConstruct(String ransomNote, String magazine){
         String s = ransomNote.toLowerCase();
         String l = magazine.toLowerCase();
         int count[] = new int[26];

         for(char c : l.toCharArray()){
            count[c - 'a']++;
         }
         for(char c : s.toCharArray()){
            if(count[c - 'a'] == 0){
                return false;
            }
            count[c - 'a']--;
        }
         return true;
    }
}