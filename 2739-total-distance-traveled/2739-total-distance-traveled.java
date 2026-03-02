class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int dist=0;
        while(mainTank>=5){
            mainTank=mainTank-5;
            if(additionalTank>=1){
                additionalTank-=1;
                mainTank+=1;
            }
            dist+=50;
        }
        int rem=mainTank%5;
        dist+=(rem*10);
        return dist;
    }
}