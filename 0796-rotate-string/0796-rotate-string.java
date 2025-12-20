class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        if(goal.equals(s)){
            return true;
        }
        int k=s.length();
        int n=s.length();
        int r=1;
        while(r<k){
            String s1="";
            char[] arr=s.toCharArray();
            char[] temp=new char[n];
            for(int i=0;i<n;i++){
                temp[(i+r)%n]=arr[i];
            }
            s1=String.valueOf(temp);
            if(s1.equals(goal)){
                return true;
            }
            r+=1;
        }
        return false;
    }
}