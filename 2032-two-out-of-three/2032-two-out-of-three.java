class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] flag1=new int[101];
        int[] flag2=new int[101];
        int[] flag3=new int[101];
        List<Integer> list=new ArrayList<>();
        int j=0;
        while(j<nums1.length){
            if(flag1[nums1[j]]==0){
                flag1[nums1[j]]++;
            }
            j+=1;
        }
        j=0;
        while(j<nums2.length){
            if(flag2[nums2[j]]==0){
                flag2[nums2[j]]++;
            }
            j+=1;
        }
        j=0;
        while(j<nums3.length){
            if(flag3[nums3[j]]==0){
                flag3[nums3[j]]++;
            }
            j+=1;
        }
        int count=0;
        for(int k=1;k<101;k++){
            count=0;
            if(flag1[k]==1)
                count++;
            if(flag2[k]==1)
                count++;
            if(flag3[k]==1)
                count++;
            if(count>=2){
                list.add(k);
            }
        }
        return list;
    }
}