class Solution {
    public int dfs(int i,int j,int[][] grid,int row,int col,int k){
        if(i<0 || j<0 || i>=row || j>=col || grid[i][j]==0){
            return 0;
        }
        int sum=grid[i][j];
        grid[i][j]=0;
        sum+=dfs(i-1,j,grid,row,col,k)%k;
        sum+=dfs(i+1,j,grid,row,col,k)%k;
        sum+=dfs(i,j-1,grid,row,col,k)%k;
        sum+=dfs(i,j+1,grid,row,col,k)%k;
        //Why we are put %k means to avoid the overflow because int can't store large no.of values, so we apply %k means the value get reduced and it can be accomodated in int.
        return sum;

    }
    public int countIslands(int[][] grid, int k) {
        int row=grid.length;
        int col=grid[0].length;
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]>0){
                    int a=dfs(i,j,grid,row,col,k);
                    if(a%k == 0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}