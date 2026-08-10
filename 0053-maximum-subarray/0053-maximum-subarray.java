class Solution {
    public int maxSubArray(int[] nums) {
        int current=nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++){
            if(current<0){
                current=0;
            }
            current+=nums[i];
            if(current > res){
                res=current;
            }
        }
        return res;
    }
}