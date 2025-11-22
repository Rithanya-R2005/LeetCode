class Solution {
    public long removeZeros(long n) {
        String s=String.valueOf(n);
        String s2="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                s2+=s.charAt(i);
            }
        }
        long n2=Long.parseLong(s2);
        return n2;
    }
}