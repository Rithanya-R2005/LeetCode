class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n1=order.length;
        int n2=friends.length;
        int[] ans=new int[n2];
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n2;i++){
            l.add(friends[i]);
        }
        int z=0;
        for(int i=0;i<n1;i++){
            if(l.contains(order[i])){
                ans[z++]=order[i];
            }
        }
        return ans;
    }
}