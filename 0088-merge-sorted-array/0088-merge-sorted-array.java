class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            return;
        }
        int[] ans=new int[m+n];
        int x=0,y=0,i=0;
        for(i=0;x<m && y<n;i++){
            if(nums1[x]<=nums2[y]){
                ans[i]=nums1[x];
                x++;
            }
            else{
                ans[i]=nums2[y];
                y++;
            }
        }
        while(!(x==m)){
            ans[i]=nums1[x];
            i++;
            x++;
        }
        while(!(y==n)){
            ans[i]=nums2[y];
            i++;
            y++;
        }
        for(i=0;i<(m+n);i++){
            nums1[i]=ans[i];
        }
    }
}