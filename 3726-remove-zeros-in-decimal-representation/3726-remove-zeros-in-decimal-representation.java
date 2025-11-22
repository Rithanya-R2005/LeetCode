class Solution {
    public long removeZeros(long n) {
        long i=1,sum=0,rem;
        while(n>0){
            rem=n%10;
            n=n/10;
            if(rem==0)  continue;
            sum=sum+i*rem;
            i*=10;
        }
        return sum;
    }
}