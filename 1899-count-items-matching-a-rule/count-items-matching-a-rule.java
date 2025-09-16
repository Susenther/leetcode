class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
       int count = 0;
       for(List<String> item : items){
         for(int i = 0;i<item.size();i++){
            String field = item.get(i);
            if((ruleKey.equals("type") && i == 0)||
            ruleKey.equals("color") && i==1 || ruleKey.equals("name") && i==2){
                if(field.equals(ruleValue)){
                    count ++;
                }
            }                  
         }
       }
       return count;
    }
}