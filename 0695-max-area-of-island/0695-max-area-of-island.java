class Solution {
    //same as 2658 question
    //DFS approach using Stack(Not backtracking)
    public int dfsstack(int i,int j,int[][] grid,int row,int col){
        Stack<int[]> st=new Stack<>();
        st.push(new int[]{i,j});
        grid[i][j]=0;
        int area=1;

        while(!st.isEmpty()){
            int[] cell=st.pop();
            int x=cell[0];
            int y=cell[1];
            if(x-1>=0 && grid[x-1][y]==1){
                st.push(new int[]{x-1,y});
                grid[x-1][y]=0;
                area++;
            }
            if(x+1 < row && grid[x+1][y]==1){
                st.push(new int[]{x+1,y});
                grid[x+1][y]=0;
                area++;
            }
            if(y-1>=0 && grid[x][y-1]==1){
                st.push(new int[]{x,y-1});
                grid[x][y-1]=0;
                area++;
            }
            if(y+1 < col && grid[x][y+1]==1){
                st.push(new int[]{x,y+1});
                grid[x][y+1]=0;
                area++;
            }
        }
        return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int max_area=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    max_area=Math.max(max_area,dfsstack(i,j,grid,row,col));
                }
            }
        }
        return max_area;
    }
}