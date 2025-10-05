class Solution {
    public String sortVowels(String s) {
        String vowels = "aeiouAEIOU";
        List<Character> res = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(vowels.indexOf(c) != -1){
                res.add(c);
            }
        }
        Collections.sort(res);

        StringBuilder sb = new StringBuilder();
        int vowelIndex = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(vowels.indexOf(c) != -1){
                sb.append(res.get(vowelIndex++));
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}