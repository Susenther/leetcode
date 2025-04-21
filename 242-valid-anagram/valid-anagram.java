class Solution {
    public boolean isAnagram(String s, String t) {
        char sortedS[] = s.toCharArray();
        char sortedT[] = t.toCharArray();

        Arrays.sort(sortedS);
        Arrays.sort(sortedT);

        s = new String(sortedS);
        t = new String(sortedT);

        if(s.equals(t)){
            return true;
        }
        else{
            return false;
        }
    }
}