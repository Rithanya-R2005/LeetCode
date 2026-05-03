class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)){
            return true;
        }
        int n=s.length();
        int k=1;
        char[] temp=s.toCharArray();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[(j+k)%n]=s.charAt(j);
            }
            String temp1=new String(temp);
            if(temp1.equals(goal)){
                return true;
            }
            k++;
        }
        return false;
    }
}