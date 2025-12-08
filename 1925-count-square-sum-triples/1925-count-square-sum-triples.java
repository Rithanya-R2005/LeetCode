class Solution {
    public int countTriples(int n) {
        int count=0,x;
        double y;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                x=i*i + j*j;
                y=Math.sqrt(x);
                if((y==(int)y) && y<=n){
                    count++;
                }
            }
        }
        return count;
    }
}