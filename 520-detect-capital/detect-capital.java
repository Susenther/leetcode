class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())){
            return true;
        }
        if(word.equals(word.toLowerCase())){
            return true;
        }
        if(word.matches("[A-Z][a-z]*")){
            return true;
        }
        return false;
    }
}