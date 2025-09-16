class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String res = String.join("",word1);
        String res1 = String.join("",word2);
        if(res.equals(res1)){
            return true;
        }else{
            return false;
        }
    }
}