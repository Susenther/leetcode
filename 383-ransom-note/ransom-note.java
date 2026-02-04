class Solution{
    public boolean canConstruct(String ransomNote, String magazine){
         String s = ransomNote.toLowerCase();
         String l = magazine.toLowerCase();
         int count[] = new int[26];

         for(char c : l.toCharArray()){
            count[c - 'a']++;
         }
         for(char c : s.toCharArray()){
            count[c - 'a']--;
         

         if(count[c - 'a'] < 0){
            return false;
         }
        }
         return true;
    }
}