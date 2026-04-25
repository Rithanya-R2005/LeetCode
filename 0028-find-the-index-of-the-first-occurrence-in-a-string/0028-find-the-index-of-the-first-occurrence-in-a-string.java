class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle)){
            return 0;
        }
        int n=haystack.length();
        int len=needle.length();
        for(int i=0;i<n;i++){
            if((i+len) < n+1){
                String s=haystack.substring(i,i+len);
                if(s.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}