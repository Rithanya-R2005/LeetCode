class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum=0,n=stones.length,b=0;
        for(int i=0;i<n;i++){
            sum+=stones[i];
        } 
        int target=sum/2;
        boolean[] dp=new boolean[target+1];
        dp[0]=true;
        for(int i=0;i<n;i++){
            for(int j=target;j>=stones[i];j--){
                if(dp[j-stones[i]]==true){
                    dp[j]=true;
                }
            }
        }
        for(int j=target;j>=0;j--){
            if(dp[j]==true){
                b=j;
                break;
            }
        }
        return sum-(b*2);
    }
}