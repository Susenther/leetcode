class Solution {
    public boolean isPalindrome(String s){
        StringBuilder sc = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sc.append(Character.toLowerCase(c));
            }
        }
        String res = sc.toString();
        String rev = sc.reverse().toString();

        return res.equals(rev);
    }
}