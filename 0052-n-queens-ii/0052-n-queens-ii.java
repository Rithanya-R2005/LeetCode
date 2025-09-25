class Solution {
    public boolean isSafe(int row,int col,int n,char[][] arr){
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row,j=col;i>=0 && j<n;i--,j++){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row,j=col;i>=0;i--){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public void queen(int row,int n,char[][] arr,List<List<String>> result){
        if(row==n){
            List<String> ans=new ArrayList<>();
            for(int i=0;i<n;i++){
                String s="";
                for(int j=0;j<n;j++){
                    s+=arr[i][j];
                }
                ans.add(s);
            }
            result.add(ans);
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(row,j,n,arr)){
                arr[row][j]='Q';
                queen(row+1,n,arr,result);
                arr[row][j]='.';
            }
        }
    }
    public int totalNQueens(int n) {
        List<List<String>> result=new ArrayList<>();
        char[][] arr=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]='.';
            }
        }
        queen(0,n,arr,result);
        return result.size();
    }
}