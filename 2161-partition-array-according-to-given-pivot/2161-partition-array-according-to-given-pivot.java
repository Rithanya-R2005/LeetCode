class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> l=new ArrayList<>();
        List<Integer> r=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                l.add(nums[i]);
            }
            else if(nums[i]>pivot){
                r.add(nums[i]);
            }
            else{
                count++;
            }
        }
        while(count-->0){
            l.add(pivot);
        }
        l.addAll(r);
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=l.get(i);
        }
        return arr;
    }
}