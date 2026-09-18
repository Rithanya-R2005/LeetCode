class Solution {
    public boolean dfs(char[][] board, boolean[][] vis,String word,int i,int j,int n,int m,int ind){
        if(ind==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=n || j>=m || board[i][j]!=word.charAt(ind) || vis[i][j]==true){
            return false;
        }
        vis[i][j]=true;
        boolean found= dfs(board,vis,word,i-1,j,n,m,ind+1) || dfs(board,vis,word,i+1,j,n,m,ind+1) || dfs(board,vis,word,i,j-1,n,m,ind+1) || dfs(board,vis,word,i,j+1,n,m,ind+1);
        vis[i][j]=false;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(board,vis,word,i,j,n,m,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}