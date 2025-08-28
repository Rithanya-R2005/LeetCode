class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int z=0;
        for(int j=0;j<arr2.length;j++){
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]==arr2[j]){
                    int t=arr1[i];
                    arr1[i]=arr1[z];
                    arr1[z]=t;
                    z++;
                }
            }
        }
        for(int i=z;i<arr1.length-1;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]>arr1[j]){
                    int a=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=a;
                }
            }
        }
        return arr1;
    }
}