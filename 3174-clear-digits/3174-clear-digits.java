class Solution {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)>=48 && sb.charAt(i)<=57){
                sb.deleteCharAt(i);
                if(sb.length()>0){
                    sb.deleteCharAt(i-1);
                }
                i=0;
            }
        }
        return sb.toString();
    }
}