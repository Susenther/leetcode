class Solution{
    public int maxFreqSum(String s){
        int v[] = new int[26];
        int co[] = new int[26];
        for(char c : s.toCharArray()){
            if(c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u'){
                v[c-'a']+=1;
            }else{
                co[c-'a']+=1;
            }
        }
        int a  = Integer.MIN_VALUE;
        int b =  Integer.MIN_VALUE;

        for(int i : v){
            if(i>a)a=i;
        }
        for(int i : co){
            if(i>b)b=i;
        }
        return a+b;
    }
}