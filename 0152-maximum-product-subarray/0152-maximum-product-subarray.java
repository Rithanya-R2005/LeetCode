class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int min=nums[0],max=nums[0],ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int x=nums[i];
            int p1=max*x;
            int p2=min*x;
            max=Math.max(x,Math.max(p1,p2));
            min=Math.min(x,Math.min(p1,p2));
            ans=Math.max(max,ans);
        }
        return ans;
    }
}