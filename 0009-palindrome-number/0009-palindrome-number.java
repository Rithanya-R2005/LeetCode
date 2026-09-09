class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else if(x<=9){
            return true;
        }
        String s=String.valueOf(x);
        int start=0,end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}