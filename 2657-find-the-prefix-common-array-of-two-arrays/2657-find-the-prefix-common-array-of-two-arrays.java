class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] freq1=new int[n+1];
        int[] freq2=new int[n+1];
        int count=0;
        for(int i=0;i<n;i++){
            freq1[A[i]]++;
            freq2[B[i]]++;
            if(A[i]==B[i]){
                count++;
            }else{
                if(freq1[A[i]]==1 && freq2[A[i]]==1){
                count++;
                }
                if(freq1[B[i]]==1 && freq2[B[i]]==1){
                    count++;
                }
            }
            A[i]=count;
        }
        return A;
    }
}