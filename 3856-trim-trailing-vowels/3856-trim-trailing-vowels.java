class Solution {
    public String trimTrailingVowels(String s) {
        int n=s.length(),len=n;
        for(int i=n-1;i>=0;i--){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                len=len-1;
            }
            else{
                break;
            }
        }
        return s.substring(0,len);
    }
}