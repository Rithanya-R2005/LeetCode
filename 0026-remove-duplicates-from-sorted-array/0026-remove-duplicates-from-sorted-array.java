class Solution {
    public int removeDuplicates(int[] nums) {
        int first=0,second=1,n=nums.length;
        for(int i=0;second<n;i++){
            if(nums[first]==nums[second]){
                second++;
                continue;
            }
            else{
                first=first+1;
                nums[first]=nums[second];
                second=second+1;
            }
        }
        return first+1;
    }
}