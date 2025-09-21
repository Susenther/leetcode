class Solution {
    public int mostWordsFound(String[] sentences) {
        int Max = 0;
        for(String s : sentences){
              int Wordcount = s.split(" ").length;
              Max = Math.max(Wordcount,Max);
        }
        return Max;
        
    }
}