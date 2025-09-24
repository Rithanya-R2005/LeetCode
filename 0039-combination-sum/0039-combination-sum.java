class Solution {
    public List<List<Integer>> backtrack(int[] c,int remaining,int start,List<List<Integer>> out,List<Integer> oned){
        if(remaining==0){
            out.add(new ArrayList<>(oned));
            return out;
        }
        for(int i=start;i<c.length;i++){
            if(c[i]>remaining)
                break;
            oned.add(c[i]);
            backtrack(c,remaining-c[i],i,out,oned);
            oned.remove(oned.size()-1);
        }
        return out;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> out=new ArrayList<>();
        List<Integer> oned=new ArrayList<>();
        Arrays.sort(candidates);
        return backtrack(candidates,target,0,out,oned);
    }
}