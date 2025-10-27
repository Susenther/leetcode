class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean []letters = new boolean[26];
        for(char c : sentence.toCharArray()){
            letters[c - 'a'] = true;
        }
        for(boolean exist:letters){
            if(!exist)return false;
        }
        return true;
    }
}