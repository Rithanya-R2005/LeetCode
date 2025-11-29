class Solution {
    //same as 2658 question
    public int dfs(int i,int j,int[][] grid,int row,int col){
        if(i<0 || j<0 || i>=row || j>=col || grid[i][j]==0){
            return 0;
        }
        int max=grid[i][j];
        grid[i][j]=0;
        max+=dfs(i-1,j,grid,row,col);
        max+=dfs(i+1,j,grid,row,col);
        max+=dfs(i,j-1,grid,row,col);
        max+=dfs(i,j+1,grid,row,col);
        return max;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int max_area=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    max_area=Math.max(max_area,dfs(i,j,grid,row,col));
                }
            }
        }
        return max_area;
    }
}