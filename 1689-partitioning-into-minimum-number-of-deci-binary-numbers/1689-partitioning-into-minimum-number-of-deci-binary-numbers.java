class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            int t=ch-'0'; // Converting char to int
            if(max<t){
                max=t;
            }
        }
        return max;
    }
}

/*long num=Long.parseLong(n);
        long max=0;
        while(num>0){
            long rem=num%10;
            if(max<rem){
                max=rem;
            }
            num=num/10;
        }
        return (int)max;*/
        //Converting to Integer is not possible here because the input string is too large, it cannot be stored in long data type itself.