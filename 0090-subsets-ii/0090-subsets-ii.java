class Solution {
    public void sub(int[] nums,List<List<Integer>> result,int i,List<Integer> temp){
        if(i==nums.length){
            if(!result.contains(temp)){
                result.add(new ArrayList<>(temp));
            }
            return;
        }
        temp.add(nums[i]);
        sub(nums,result,i+1,temp);
        temp.remove(temp.size()-1);
        sub(nums,result,i+1,temp);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(nums);
        sub(nums,result,0,temp);
        return result;
    }
}