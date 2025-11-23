class Solution {
    public int minimumFlips(int n) {
        String s="";
        int rem,flag=0,count=0;
        while(n>0){
            rem=n%2;
            n/=2;
            // if(rem==0 && flag==0){
            //     continue;
            // }
            // else{
               // flag=1;
                s=s+String.valueOf(rem);
            //}
        }
        StringBuilder s1=new StringBuilder();
        s1.append(s);
        s1.reverse();
        System.out.println(s);
        System.out.println(s1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s1.charAt(i)){
                count++;
            }  
        }
        return count;
    }
}