class Solution {
    public int minCost(int maxTime, int[][] edges, int[] passingFees) {
        int n=passingFees.length;
        List<int[]>[] adj=new ArrayList[n];
        //The above line is static arraylist ,i.e arraylist size is fixed.
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
        for(int[] arr:edges){
            int u=arr[0];
            int v=arr[1];
            int time=arr[2];
            adj[u].add(new int[]{v,time});
            adj[v].add(new int[]{u,time});
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a ->a[0]));
        pq.offer(new int[]{passingFees[0],0,0});
        int[] minTime=new int[n];
        Arrays.fill(minTime, Integer.MAX_VALUE);
        minTime[0]=0;
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int cost=curr[0];
            int time=curr[1];
            int city=curr[2];
            if(city==n-1)
                return cost;
            for(int[] neighbor : adj[city]){
                int nextCity=neighbor[0],travelTime=neighbor[1];
                int newTime=time+travelTime,newCost=cost+passingFees[nextCity];
                if(newTime <= maxTime && newTime < minTime[nextCity]){
                    minTime[nextCity]=newTime;
                    pq.offer(new int[]{newCost,newTime,nextCity});
                }
            }
        }
        return -1;
    }
}