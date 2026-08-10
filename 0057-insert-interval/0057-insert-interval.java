class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        int[][] in=new int[n+1][2];
        in[0]=newInterval;
        for(int i=1;i<n+1;i++){
            in[i]=intervals[i-1];
        }
        Arrays.sort(in, (a,b)-> Integer.compare(a[0],b[0]));
        n=n+1;
        List<int[]> list=new ArrayList<>();
        int start=in[0][0];
        int end=in[0][1];
        for(int i=1;i<n;i++){
            if(end>=in[i][0]){
                end=Math.max(end,in[i][1]);
            }
            else{
                list.add(new int[]{start,end});
                start=in[i][0];
                end=in[i][1];
            }
        }
        list.add(new int[]{start,end});

        int len=list.size();
        int[][] ans=new int[len][2];
        int index=0;
        for(int i=0;i<len;i++){
            ans[index++]=list.get(i);
        }
        return ans;
    }
}