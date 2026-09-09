class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int start=0,end=s.length()-1;
        while(start<end){
            char a=s.charAt(start);
            char b=s.charAt(end);
            if(!((a>='a' && a<='z') || (a>='0' && a<='9'))){
                start++;
            }
            if(!((b>='a' && b<='z') || (b>='0' && b<='9'))){
                end--;
            }
            else{
                if(a>='a' && a<='z' || a>='0' && a<='9'){
                    if(a!=b){
                        return false;
                    }
                    start++;
                    end--;
                }
            }
        }
        return true;
    }
}