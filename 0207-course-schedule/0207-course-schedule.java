class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] mat=new int[numCourses][numCourses];
        int[] indegree=new int[numCourses];
        int[] visited=new int[numCourses];
        //int[] result=new int[numCourses];
        int c=0,m=0,count=0;
        boolean found=false;
        for(int[] oned:prerequisites){
            int a=oned[0];
            int b=oned[1];
            mat[b][a]=1;
            indegree[a]++; 
            //without using 2 for loop(below) we can easily calculate indegree
        }
        // for(int i=0;i<numCourses;i++){
        //     c=0;
        //     for(int j=0;j<numCourses;j++){
        //         if(mat[j][i]==1){
        //             c++;
        //         }
        //     }
        //     indegree[i]=c;
        // }
        
        while(count<numCourses){
            found=false;
            for(int i=0;i<numCourses;i++){
                if(indegree[i]==0 && visited[i]==0){
                    //result[m]=i;  Result array contains the resultant topological sorted array.
                    //m++;
                    visited[i]=1;
                    for(int j=0;j<numCourses;j++){
                        if(mat[i][j]==1){
                            indegree[j]--;
                        }
                    }
                count++;
                found=true;
                }
            }
            if(!found)
                return false; //The graph contains the cyclic path.That is no node with indegree=0.
        }

        // for(int i=0;i<numCourses;i++){
        //     if(indegree[i]!=0){
        //         return false;
        //     }
        // }

        return true;
    }
}