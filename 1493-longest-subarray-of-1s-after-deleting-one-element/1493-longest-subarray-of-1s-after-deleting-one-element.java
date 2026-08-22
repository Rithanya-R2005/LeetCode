class Solution {
    public int fun(int i,int n,int[] nums){
        int count=0,found=0;
        for(int x=i;x<n;x++){
            if(nums[x]==1){
                count++;
            }
            else if(nums[x]==0 && found==0){
                //count++;
                found=1;
            }
            else if(nums[x]==0 && found==1){
                return count;
            }
        }
        return count;
    }
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int max=0;
        int c=0;
        for(int num: nums){
            if(num==1){
                c++;
            }
        }
        if(c==n){
            return n-1;
        }
        else if(c==0){
            return c;
        }
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                max=Math.max(max,fun(i,n,nums));
            }
        }
        return max;
    }
}