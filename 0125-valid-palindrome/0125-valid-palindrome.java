class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder(s);
        // Because sb is muttable and string is imuttable.
        String s1="";
        for(int i=0;i<s.length();i++){
            int a=sb.charAt(i);
            if(a>=65 && a<=90){
                a+=32;
                char b=(char)a;
                sb.setCharAt(i,b);
            }
            if((a>=97 && a<=122) || (a>=48 && a<=57)){ // 48 to 57 is a ascii character of number 0 to 9.
                s1+=sb.charAt(i);
            }
        }
        int start=0,end=s1.length()-1;
        while(start<end){
            if(s1.charAt(start)!=s1.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}