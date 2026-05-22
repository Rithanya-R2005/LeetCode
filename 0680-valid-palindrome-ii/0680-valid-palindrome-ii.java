class Solution {
    public boolean palin(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int start=0,end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return (palin(s,start,end-1) || palin(s,start+1,end));
            }
            start++;
            end--;
        }
        return true;
    }
}
//see the test case in 2nd time submitted is very imp