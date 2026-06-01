class Solution {
    public int minimumCost(int[] cost) {
        int n=cost.length;
        if(n<=2){
            if(n == 2){
                return cost[0]+cost[1];
            }
            else if(n == 1){
                return cost[0];
            }
            else if(n == 0){
                return 0;
            }
        }
        Arrays.sort(cost);
        int min=0;
        for(int i=n-1;i>=0;i=i-3){
            if(i>=2){
                min+=(cost[i]+cost[i-1]);
            }
            else if(i<2){
                while(i >= 0){
                    min+=cost[i];
                    i=i-1;
                }
                break;
            }
        }
        return min;
    }
}