class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        int n=intervals.length;
        List<int[]> list=new ArrayList<>();
        if(n==1){
            return intervals;
        }
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<n;i++){
            //overlapping
            if(end >= intervals[i][0]){
                end=Math.max(end,intervals[i][1]);
            }
            //Not overlapping
            else{
                    list.add(new int[]{start,end});
                    start=intervals[i][0];
                    end=intervals[i][1];
            }
        }
        // for adding the last interval
        list.add(new int[]{start,end});

        int[][] ans=new int[list.size()][2];
        int index=0;
        for(int i=0;i<list.size();i++){
            ans[index++]=list.get(i);
        }
        return ans;
    }
}