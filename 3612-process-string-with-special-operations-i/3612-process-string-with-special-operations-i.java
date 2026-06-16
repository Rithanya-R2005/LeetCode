class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                sb.append(s.charAt(i));
            }
            else if(s.charAt(i)=='*'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else if(s.charAt(i)=='#'){
                sb.append(sb);
            }
            else if(s.charAt(i)=='%'){
                sb=sb.reverse();
            }
        }
        return sb.toString();
    }
}