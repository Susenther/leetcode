class Solution {
    public int finalValueAfterOperations(String[] operations){
        int x = 0;
        for(String of : operations){
            if(of.contains("+")){
                x++;
            }else{
                x--;
            }
        }
        return x;
    }
}