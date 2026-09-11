class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer>  hm=new HashMap<>();
        int n=nums.length,ind=0,k=0;
        for(int i=0;i<n;i++){
            if(hm.containsKey(nums[i])){
                if(hm.get(nums[i])==1){
                hm.put(nums[i],2);
                nums[ind++]=nums[i];
                k+=1;
                }
                else if(hm.get(nums[i])==2){
                    continue;
                }
            }
            else{
                hm.put(nums[i],1);
                nums[ind++]=nums[i];
                k+=1;
            }
        }
        return k;
    }
}