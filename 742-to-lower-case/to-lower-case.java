class Solution {
    public String toLowerCase(String s) {

        char[] ch = s.toCharArray();
        int n = s.length();
         for(int i =0;i<n;i++){
            if(ch[i] >= 'A' && ch[i] <= 'Z' ){
              ch[i] = (char)(ch[i]+32);
         }
        }

        String str = String.valueOf(ch);
        return str;
    }
}