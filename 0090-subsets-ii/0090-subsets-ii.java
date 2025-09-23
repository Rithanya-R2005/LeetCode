class Solution {
    public void sub(int[] nums,Set<List<Integer>> result,int i,List<Integer> temp){
        if(i==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        sub(nums,result,i+1,temp);
        temp.remove(temp.size()-1);
        sub(nums,result,i+1,temp);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> result=new HashSet<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(nums);
        sub(nums,result,0,temp);
        List<List<Integer>> result2=new ArrayList<>(result);
        return result2;
    }
}