class Solution {
    public int bs1(int[] nums,int target,int start,int end,int ans){
        int mid=(start+end)/2;
        if(start>end){
            return ans;
        }
        if(nums[mid]==target){
            ans=mid;
            end=mid-1;
            return ans=bs1(nums,target,start,end,ans);
        }
        else if(nums[mid]<target){
            return bs1(nums,target,mid+1,end,ans);
        }
        else{
            return bs1(nums,target,start,mid-1,ans);
        }
    }
    public int bs2(int[] nums,int target,int start,int end,int ans){
        int mid=(start+end)/2;
        if(start>end){
            return ans;
        }
        if(nums[mid]==target){
            ans=mid;
            start=mid+1;
            return ans=bs2(nums,target,start,end,ans);
        }
        else if(nums[mid]<target){
            return bs2(nums,target,mid+1,end,ans);
        }
        else{
            return bs2(nums,target,start,mid-1,ans);
        }
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        Arrays.fill(ans,-1);
        int n=nums.length;
        ans[0]=bs1(nums,target,0,n-1,-1);
        ans[1]=bs2(nums,target,0,n-1,-1);
        return ans;
    }
}