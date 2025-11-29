class Solution {
    public int orangesRotting(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;

        Queue<int[]> q=new LinkedList<>();
        int fresh=0;

        // Step 1: Add all rotten oranges(index) to queue, count fresh ones
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        // if no fresh oranges → no time needed
        if(fresh==0)
            return 0;
        int minutes=-1; // BFS level counter

        // Step 2: BFS to rot adjacent fresh oranges
        while(!q.isEmpty()){
            int size=q.size();
            minutes++;  // new minute
            while(size-- > 0){
                int[] cur=q.poll();
                int r=cur[0];
                int c=cur[1];

                if(r>0 && grid[r-1][c]==1){
                    grid[r-1][c]=2;
                    q.add(new int[]{r-1,c});
                    fresh--;
                }
                if(r<row-1 && grid[r+1][c]==1){
                    grid[r+1][c]=2;
                    q.add(new int[]{r+1,c});
                    fresh--;
                }
                if(c>0 && grid[r][c-1]==1){
                    grid[r][c-1]=2;
                    q.add(new int[]{r,c-1});
                    fresh--;
                }
                if(c<col-1 && grid[r][c+1]==1){
                    grid[r][c+1]=2;
                    q.add(new int[]{r,c+1});
                    fresh--;
                }
            }
        }
        return fresh==0 ? minutes : -1;
    }
}