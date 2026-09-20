class Solution {
    public int reverseDegree(String s) {
        int n=s.length(),sum=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            int pos=c-'a'+1;
            int reversed_alphabet=Math.abs(pos-26)+1;
            sum+=((i+1)*reversed_alphabet);
        }
        return sum;
    }
}