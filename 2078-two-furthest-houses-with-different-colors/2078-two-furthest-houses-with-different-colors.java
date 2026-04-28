class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int start1=0,start2=0;
        int end1=n-1,end2=n-1;
        int m=0;
        while(start1<end1){
            if(colors[start1]!=colors[end1]){
                m=Math.max(m,Math.abs(end1-start1));
                break;
            }
            else{
                end1--;
            }
        }
        while(start2<end2){
            if(colors[start2]!=colors[end2]){
                m=Math.max(m,Math.abs(end2-start2));
                break;
            }
            else{
                start2++;
            }
        }
        return m;
    }
}