class Solution {
    public String reverseWords(String s) {
        String []words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i = 0;i<words.length;i++){
        StringBuilder sb = new StringBuilder(words[i]);
        sb.reverse();
        res.append(sb);

        if(i<words.length-1){
            res.append(" ");
        }

        }
        return res.toString();
    }
}