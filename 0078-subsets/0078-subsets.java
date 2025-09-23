class Solution {
    public void sub(int[] nums,List<List<Integer>> result,int i,List<Integer> temp){
        if(nums.length==i){
            result.add(new ArrayList<>(temp));  
            /*We need to add the temp Array List by passing as contructor means only it get adding, result.add(temp) is not working here.*/
            return;
        }
        temp.add(nums[i]);
        sub(nums,result,i+1,temp);
        temp.remove(temp.size()-1);
        sub(nums,result,i+1,temp);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        sub(nums,result,0,temp);
        return result;
    }
}