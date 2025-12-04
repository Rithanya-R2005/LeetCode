class Solution {
    public double power(double x,int n){
        if(n==0)
            return 1;
        double result=power(x,n/2);
        if(n%2==0)
            return result*result;
        else
            return result*result*x;
    }
    public double myPow(double x, int n) {
        if(n==0)
            return 1;
        if(n==1 || x==1)
            return x;
        if(n<0){
            x=1/x;
            n=-n;
        }
        double ans=power(x,n);
        return ans;
    }
}