class Solution {
    public int countOdds(int low, int high) {
        int a=high-low;
        int b=a/2;
        if((low&1)==1 || (high&1)==1)
            return b+1;
        else
            return b;
    }
}