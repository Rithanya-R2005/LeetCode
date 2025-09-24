class Solution {
    public List<List<Integer>> func(int[] c,int remaining,int start,List<Integer> oned,List<List<Integer>> out){
        if(remaining==0){
            out.add(new ArrayList<>(oned));
            return out;
        }
        for(int i=start;i<c.length;i++){
            if(c[i]>remaining){
                break;
            }
            oned.add(c[i]);
            func(c,remaining-c[i],i+1,oned,out);
            while((i+1) < c.length && c[i]==c[i+1]){
                i++;
            } // To remove the duplicates
            oned.remove(oned.size()-1);
        }
       return out;
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> oned=new ArrayList<>();
        List<List<Integer>> out=new ArrayList<>();
        return func(candidates,target,0,oned,out);
    }
}