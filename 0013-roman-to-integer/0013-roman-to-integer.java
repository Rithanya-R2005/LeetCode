class Solution {
    public int romanToInt(String s) {
        int[] n={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] str={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int res=0;
        int i=0,j=0;
        while(i<s.length()){
            //2-character match
            if(i+1 < s.length()){
                String s2=s.substring(i,i+2);
                if(s2.equals(str[j])){
                    res+=n[j];
                    i=i+2;
                    continue;
                }
            }

            //1-character match
            String s1=s.substring(i,i+1);
            if(s1.equals(str[j])){
                res+=n[j];
                i=i+1;
            }
            else{
                j++;
            }
        }
        return res;
    }
}