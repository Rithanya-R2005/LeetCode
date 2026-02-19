class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int balance=0,lower_bound=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                balance++;
            }
            else{
                balance--;
            }
            if(balance==0){
                String str="";
                for(int j=lower_bound+1;j<=(i-1);j++){
                    str+=s.charAt(j);
                }
                lower_bound=i+1;
                sb.append(str);
            }
        }
        return sb.toString();
    }
}