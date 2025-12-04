class Solution {
    public int gcd(int a,int b){
        if(a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        int oddSum=n*n;
        int evenSum=n*(n+1);
        //Remaining Approaches in Note nearer to the submit button.
        return gcd(oddSum,evenSum);
    }
}