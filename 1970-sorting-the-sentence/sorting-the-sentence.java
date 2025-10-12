class Solution {
    public String sortSentence(String s) {
        String []words = s.split(" ");

        String []res = new String[words.length];

        for(String word:words){
            int length = word.length();

            char p = word.charAt(length - 1);

            int index = Character.getNumericValue(p)-1;

            String actualWord = word.substring(0,length-1);

            res[index] = actualWord;
        }
        return String.join(" ",res);

    }
}