class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n=boxGrid.length;
        int m=boxGrid[0].length;
        char[][] ch=new char[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ch[j][n-1-i]=boxGrid[i][j];
                //Transpose is Done and rotation also done by -> [n-1-i]
            }
        }
        // In ch array m is row and n is column
        
        for(int k=0;k<m;k++){
            for(int i=m-1;i>=1;i--){
                for(int j=0;j<n;j++){
                    if(ch[i][j]=='.' && ch[i-1][j]=='#'){
                        char temp=ch[i][j];
                        ch[i][j]=ch[i-1][j];
                        ch[i-1][j]=temp;
                    }
                }
            }
        }
        return ch;
    }
}