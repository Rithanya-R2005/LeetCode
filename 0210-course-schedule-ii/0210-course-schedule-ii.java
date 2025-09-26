class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[][] mat=new int[numCourses][numCourses];
        int[] indegree=new int[numCourses];
        int[] visited=new int[numCourses];
        int[] result=new int[numCourses];
        int c=0,count=0,m=0;
        boolean found=false;
        for(int[] pair:prerequisites){
            int a=pair[0];
            int b=pair[1];
            mat[b][a]=1;
        }
        for(int i=0;i<numCourses;i++){
            c=0;
            for(int j=0;j<numCourses;j++){
                if(mat[j][i]==1){
                    c++;
                }
            }
            indegree[i]=c;
        }
        while(count<numCourses){
            found=false;
            for(int i=0;i<numCourses;i++){
                if(indegree[i]==0 && visited[i]==0){
                    result[m]=i;
                    m++;
                    visited[i]=1;
                    for(int j=0;j<numCourses;j++){
                        if(mat[i][j]==1){
                            indegree[j]--;
                        }
                    }
                    found=true;
                    count++;
                }
            }
            if(!found){
                return new int[0];
            }
        }
        return result;
    }
}