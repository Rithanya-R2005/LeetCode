class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int j=0,n=nums.length;
        for(int i=0;i<nums.length;i++){
            j=i+1;
            if((i%2==0 && nums[i]%2==0) || (i%2!=0 && nums[i]%2!=0)){
                continue;
            }
            else if(i%2==0){
                while(j<n){
                    if(nums[j]%2==0 && j<n){
                        int t=nums[i];
                        nums[i]=nums[j];
                        nums[j]=t;
                        break;
                    }
                    j++;
                }
            }
            else{
                while(j<n){
                    if(nums[j]%2!=0 && j<n){
                        int t=nums[i];
                        nums[i]=nums[j];
                        nums[j]=t;
                        break;
                    }
                    j++;
                }
            }
        }
        return nums;
    }
}