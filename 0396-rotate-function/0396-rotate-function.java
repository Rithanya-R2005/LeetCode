class Solution {
    public int maxRotateFunction(int[] nums) {
        // int max=Integer.MIN_VALUE,n=nums.length,k=0;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=0;j<n;j++){
        //         sum=sum + (j*nums[(j-i+n)%n]);
        //     }
        //     k++;
        //     max=Math.max(max,sum);
        // }
        // return max;

        int n=nums.length;
        int totalSum=0,curr=0;
        for(int i=0;i<n;i++){
            totalSum+=nums[i];
            curr+=i*nums[i];
        }

        int max=curr;

        for(int i=1;i<n;i++){
            curr = totalSum + curr - n * nums[n-i];
            max=Math.max(max,curr);
        }
        return max;
    }
}