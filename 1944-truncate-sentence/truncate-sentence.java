class Solution {
    public String truncateSentence(String s, int k) {
        String []str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<k && i<s.length();i++){
            sb.append(str[i]).append(" ");
        }
        String res =  sb.toString().trim();
        return res;
    }
}