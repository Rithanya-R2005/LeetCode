class Solution {
    public int arrangeCoins(int n) {
        if(n==1){
            return n;
        }
        else if(n==0){
            return n;
        }
        else if(n==2){
            return 1;
        }
        int i=1;
        while(n>0){
            n=n-i;
            if(n>=0){
                i++;
            }
        }
        return i-1;
    }
}