int minDeletionSize(char** strs, int strsSize) {
    int n=strsSize;
    int m=strlen(strs[0]);
    int count=0;
    for(int j=0;j<m;j++){
        for(int i=1;i<n;i++){
            if(strs[i-1][j] > strs[i][j]){
                count++;
                break;
            }
        }
    }
    return count;
}