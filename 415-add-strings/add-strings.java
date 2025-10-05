class Solution {
    public String addStrings(String num1, String num2) {
         StringBuilder s1 = new StringBuilder();
         int carry = 0;
         int i  = num1.length() - 1;
         int j = num2.length() - 1;
         while(i >= 0 || j >= 0 || carry != 0){
            int n1  = (i >= 0)? num1.charAt(i) - '0' : 0;
            int n2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            i--;
            j--;
            int sum = n1+n2+carry;
            s1.append(sum%10);
            carry = sum/10;
         }
        return s1.reverse().toString();
    }
     
}