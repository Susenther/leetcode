class Solution{
    public boolean canConstruct(String ransomNote, String magazine){
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : magazine.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }

        for(char c : ransomNote.toCharArray()){
            map.put(c,map.getOrDefault(c,0) - 1);
        }
        
        for(char c : map.keySet()){
            if(map.get(c) < 0){
                return false;
            }
        }

        return true;

    }
}