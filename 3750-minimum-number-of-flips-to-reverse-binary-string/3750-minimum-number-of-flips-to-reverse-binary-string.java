class Solution {
    public int minimumFlips(int n) {
        String s="";
        int rem,flag=0,count=0;
        while(n>0){
            rem=n%2;
            n/=2;
            // if(rem==0 && flag==0){     //for leading zeros
            //     continue;
            // }
            // else{
               // flag=1;
                s=s+String.valueOf(rem);
            //}
        }
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                count+=2;
            } 
            i++;
            j--; 
        }
        return count;
    }
}