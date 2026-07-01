class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0,right=m-1,top=0,bottom=n-1;
        int j;
        while(top<=bottom && left<=right){
            if(left<=right){
                for(j=left;j<=right;j++){
                list.add(matrix[top][j]);
                }
                top=top+1;
            }

            if(top<=bottom){
                for(j=top;j<=bottom;j++){
                list.add(matrix[j][right]);
                }
                right=right-1;
            }

            if(top<=bottom){
                for(j=right;j>=left;j--){
                list.add(matrix[bottom][j]);
                }
                bottom=bottom-1;
            }
            
            if(left<=right){
                for(j=bottom;j>=top;j--){
                list.add(matrix[j][left]);
                }
                left=left+1;
            }
  

        }
        return list;
    }
}