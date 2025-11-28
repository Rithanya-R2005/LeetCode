class Solution {
    public int dfs(int i,int j,int[][] grid,int row,int col){
        if(i<0 || j<0 || i>=row || j>=col || grid[i][j]==0){
            return 0;
        }
        int fish=grid[i][j];
        grid[i][j]=0;
        fish += dfs(i-1,j,grid,row,col);
        fish += dfs(i+1,j,grid,row,col);
        fish += dfs(i,j-1,grid,row,col);
        fish += dfs(i,j+1,grid,row,col);
        return fish;
    }
    public int findMaxFish(int[][] grid) {
        int fishes=0;
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]!=0){
                    fishes=Math.max(fishes,dfs(i,j,grid,row,col));
                }
            }
        }
        return fishes;
    }
}