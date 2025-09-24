class Solution {
    public void com(List<List<Integer>> result,int n,int k,int i,List<Integer> temp){
        if(temp.size()==k){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(i==n+1){
            return;
        }
        temp.add(i);
        com(result,n,k,i+1,temp);
        temp.remove(temp.size()-1);
        com(result,n,k,i+1,temp);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        com(result,n,k,1,temp);
        return result;
    }
}