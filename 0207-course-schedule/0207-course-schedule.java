class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        int[] indegree=new int[numCourses];
        for(int[] pre: prerequisites){
            int c=pre[0];
            int p=pre[1];
            graph.get(p).add(c);
            indegree[c]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int completed=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            completed++;
            for(int nei:graph.get(curr)){
                indegree[nei]--;
                if(indegree[nei]==0){
                    q.offer(nei);
                }
            }
        }
        return completed==numCourses;
    }
}