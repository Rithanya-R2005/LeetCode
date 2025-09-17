class Solution {
    public int lengthOfLongestSubstring(String s) {
        String s1="";
        char a,b;
        int m=0;
        for(int i=0;i<s.length();i++){
            a=s.charAt(i);
            if(s1.indexOf(a)==-1){
                s1+=a;
                m=Math.max(m,s1.length());
            }
            else{
                m=Math.max(m,s1.length());
                for(int j=s1.length()-1;j>=0;j--){
                    if(s1.charAt(j)==s.charAt(i) && s1.length()==1){
                        i=i-1;
                        break;
                    }
                    else if(s1.charAt(j)==s.charAt(i)){
                        i=i-1;
                        break;
                    }
                    else{
                        i=i-1;
                    }
                }
                s1="";
            }
        }
        return m;
    }
}