class Solution {
    public boolean isUgly(int n) {
        if(n==1)
            return true; // 1 is ugly number.
        if(n<=0){
            return false;
            //because Ugly numbers are defined only for positive integers, if a negative number is arrived then we can directly say as not ugly. 0 is aslo not ugly.
        }
        while(n>0){
            if(n%2==0){
                n=n/2;
            }
            else if(n%3==0){
                n=n/3;
            }
            else if(n%5==0){
                n=n/5;
            }
            else{
                break;
            }
        }
        if(n==1){
            return true;
        }
        else{
            return false;
        }
    }
}