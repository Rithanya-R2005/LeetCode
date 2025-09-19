class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rlen=obstacleGrid.length;
        int clen=obstacleGrid[0].length;
        int[][] dp=new int[rlen][clen];
        int i=0,j=0;
        //If 0,0 or m,n have obstacle means not able to reach
        if(obstacleGrid[0][0]==1 || obstacleGrid[rlen-1][clen-1]==1){
            return 0;
        }
        /*Making the 1st row of dp as 1 wherever no obstacle is found.if obstacle have means make it as 0(While initializing the array itself it is is 0 only.)*/
        for(j=0;j<clen;j++){
            if(obstacleGrid[0][j]==1){
                break; // because it have obstacle means we can't move further in that row.
            }
            dp[0][j]=1;
        }
        /*Making the 1st column of dp as 1 wherever no obstacle is found.if obstacle have means make it as 0(While initializing the array itself it is is 0 only.)*/
        for(i=0;i<rlen;i++){
            if(obstacleGrid[i][0]==1){
                break;
            }
            dp[i][0]=1;
        }
        for(i=1;i<rlen;i++){
            for(j=1;j<clen;j++){
                if(obstacleGrid[i][j]==1){
                    continue;
                }
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[rlen-1][clen-1];
    }
}